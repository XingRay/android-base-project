package com.github.xingray.androidbase.camera

interface CameraPreviewCallback {
    fun onPreviewFrame(cameraImage: CameraImage, camera: Camera)
}