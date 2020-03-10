package com.s.newpattern;

import com.s.adapter.*;
import com.s.BridgePattern.*;
import CommandPattern.*;
import com.s.TemplatePattern.*;
import com.s.Prototype.*;
import com.s.Singleton.*;
public class App 
{
    public static void main( String[] args )
    {	
    	DriverAdapter da=new DriverAdapter();
    	DriverBridge db=new DriverBridge();
    	DriverCommandPattern dc=new DriverCommandPattern();
    	DriverTemplatePattern dt=new DriverTemplatePattern();
    	DriverPrototype dp=new DriverPrototype();
    	DriverSingleton ds=new DriverSingleton();
    }
}
