package com.s.adapter;

class BirdAdapter implements ToyDuck 
{ 
    Bird bird; 

    public void squeak() 
    { 
        bird.makeSound(); 
    } 
    public BirdAdapter(Bird bird) 
    { 
        this.bird = bird; 
    } 
  
} 
