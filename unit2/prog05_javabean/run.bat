@echo off
javac JellyBeanDemo.java
jar cfm JellyBean.jar manifest.mft JellyBean.class
echo JellyBean.jar created with manifest.mft successfully.
echo Launching JellyBean Component Demo...
java JellyBeanDemo
pause
