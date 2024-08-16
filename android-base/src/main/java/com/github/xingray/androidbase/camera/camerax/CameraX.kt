package com.github.xingray.androidbase.camera.camerax

import com.nanosecond.makeup.android.camera.Camera
import com.nanosecond.makeup.android.camera.CameraApi
import com.nanosecond.makeup.android.camera.CameraImage
import com.nanosecond.makeup.android.camera.CameraPreviewCallback
import com.nanosecond.makeup.android.camera.LensFacing
import com.nanosecond.makeup.android.camera.Photo
import java.io.File

class CameraX(
    private val mCameraId: String,
    private val mLensFacing: LensFacing,
    private val mCameraApi: CameraApi
) : Camera {

    private var mPreviewCallback: ((CameraImage, Camera) -> Unit)? = null

    override val lensFacing: LensFacing
        get() = mLensFacing
    override val cameraApi: CameraApi
        get() = mCameraApi

    override fun open() {
    }


    override fun startPreview() {

    }

    override fun stopPreview() {

    }

    override fun close() {
    }

    override fun setPreviewViewSize(width: Int, height: Int) {
    }

    override fun setPreviewCallback(callback: CameraPreviewCallback) {
        mPreviewCallback = callback::onPreviewFrame
    }

    override fun setPreviewCallback(callback: (CameraImage, Camera) -> Unit) {
        mPreviewCallback = callback
    }

    override fun addCallbackBuffer(data: ByteArray) {

    }

    override fun takePhoto(failedCallback: ((errorCode: Int, errorMessage: String) -> Unit)?, successCallback: ((photo: Photo, camera: Camera) -> Unit)?) {

    }
}