package com.yefeng.androidarchitecturedemo.data.source.book.local;

import android.support.annotation.NonNull;

import com.yefeng.androidarchitecturedemo.data.model.book.Book;
import com.yefeng.androidarchitecturedemo.data.model.book.BookDao;
import com.yefeng.androidarchitecturedemo.data.source.book.BookDataSource;
import com.yefeng.androidarchitecturedemo.data.source.db.DbGreen;
import com.yefeng.support.DebugLog;

import java.util.List;

import io.reactivex.Flowable;
import timber.log.Timber;

/**
 * Created by yefeng on 07/02/2017.
 */

public class BookLocalDataSource implements BookDataSource {

    private BookDao getBookDao() {
        return DbGreen.getInstance().getDaoSession().getBookDao();
    }

    @Override
    public Flowable<List<Book>> getBooks() {
        try {
            Timber.d("test log: sleep from db");
            DebugLog.logThread("getSampleBooks", Thread.currentThread().getName(), Thread.currentThread().getId());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Flowable.just(getBookDao().loadAll());
    }

    @Override
    public Flowable<Book> getBook(@NonNull String id) {
        return Flowable.just(getBookDao().load(Long.valueOf(id)));
    }

    @Override
    public Flowable saveBook(@NonNull Book book) {
        getBookDao().save(book);
        return Flowable.empty();
    }

    public Flowable saveBooks(@NonNull List<Book> books) {
        getBookDao().saveInTx(books);
        return Flowable.empty();
    }

    @Override
    public Flowable deleteBooks() {
        getBookDao().deleteAll();
        return Flowable.empty();
    }

    @Override
    public Flowable deleteBook(@NonNull String id) {
        getBookDao().deleteByKey(Long.valueOf(id));
        return Flowable.empty();
    }
}
