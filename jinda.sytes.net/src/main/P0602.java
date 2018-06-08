package main;

import org.bytedeco.javacpp.opencv_core;

import static org.bytedeco.javacpp.opencv_core.cvReleaseImage;
import static org.bytedeco.javacpp.opencv_imgcodecs.cvLoadImage;
import static org.bytedeco.javacpp.opencv_imgcodecs.cvSaveImage;
import static org.bytedeco.javacpp.opencv_imgproc.cvSmooth;

public class P0602 {
    public static void main(String[] args) {
        String filename = "C:/Users/zin/Documents/카카오톡 받은 파일";
        opencv_core.IplImage image = cvLoadImage(filename);
        if (image != null) {
            cvSmooth(image, image);
            cvSaveImage(filename, image);
            cvReleaseImage(image);
        }
    }
}
