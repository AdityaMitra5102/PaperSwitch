import threading
import os

def task1():
	os.system("python run.py")
def task2():
	os.system("java Main")

t1=threading.Thread(target=task1, name='t1')
t2=threading.Thread(target=task2, name='t2')
t1.start()
t2.start()
t1.join()
t2.join()
