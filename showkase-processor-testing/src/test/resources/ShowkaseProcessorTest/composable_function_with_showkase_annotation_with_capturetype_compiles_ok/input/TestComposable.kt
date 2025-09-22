package com.airbnb.android.showkase_processor_testing

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ScreenshotCaptureType
import com.airbnb.android.showkase.annotation.ShowkaseComposable

@ShowkaseComposable(
    name = "single animated",
    group = "group",
    screenshotCaptureType = ScreenshotCaptureType.SingleAnimatedImage
)
@Composable
internal fun TestComposableSingleAnimatedImage() {
}

@ShowkaseComposable(
    name = "multiple images",
    group = "group",
    screenshotCaptureType = ScreenshotCaptureType.MultipleImagesAtOffsets
)
@Composable
internal fun TestComposableMultipleImagesAtOffsets() {
}