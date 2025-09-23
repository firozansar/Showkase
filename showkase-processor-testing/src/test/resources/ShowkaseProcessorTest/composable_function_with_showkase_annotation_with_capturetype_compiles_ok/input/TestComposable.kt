package com.airbnb.android.showkase_processor_testing

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ScreenshotCaptureConfig
import com.airbnb.android.showkase.annotation.ScreenshotCaptureType
import com.airbnb.android.showkase.annotation.ShowkaseComposable

@ShowkaseComposable(
    name = "single animated",
    group = "group",
    screenshotCaptureConfig = ScreenshotCaptureConfig(ScreenshotCaptureType.SingleAnimatedImage)
)
@Composable
internal fun TestComposableSingleAnimatedImage() {
}

@ShowkaseComposable(
    name = "multiple images",
    group = "group",
    screenshotCaptureConfig = ScreenshotCaptureConfig(ScreenshotCaptureType.MultipleImagesAtOffsets)
)
@Composable
internal fun TestComposableMultipleImagesAtOffsets() {
}