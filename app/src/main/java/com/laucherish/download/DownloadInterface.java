package com.laucherish.download;

@SuppressWarnings("ALL")
public interface DownloadInterface {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
