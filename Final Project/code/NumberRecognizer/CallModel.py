import sys
import cv2
import numpy as np
import tensorflow as tf

def main(argv):
  # load the model
  model = tf.keras.models.load_model('handwritten_number_recognizer.model')

  # read the image and recognize
  try:
    img = cv2.imread(argv[0])[:, :, 0]
    img = np.invert(np.array([img]))
    prediction = model.predict(img)
    print(np.argmax(prediction[0]))
  except:
    print("Error!")

if __name__ == "__main__":
    main(sys.argv[1:])