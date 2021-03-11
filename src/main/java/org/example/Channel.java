package org.example;

/**
 * User: HP
 * Date: 3/11/2021
 * Time: 5:12 AM
 */
public class Channel {

    static Channel ChannelObject = null;
    boolean stateRecorded = false;
    int channelState = 0;
    int data = 0;

    private Channel(){
        System.out.println("Channel Constructor is being called!");
    }

    static Channel getChannelObject(){
        if(ChannelObject == null){
            return new Channel();
        }
        return ChannelObject;

    }


}