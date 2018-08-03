/*
A GUI Component is an object that represents a scree element that displays information to the user

Java components and other GUI-related classes are located in the following packages
    --> java.awt
    --> javax.swing

    Original package was the Abstract Windowing Toolkit (AWT)
    Swing replaced it, which provides more components that are more versatile

    A container is a type of component that holds and organizes other components

    A frame is a container that is used to display GUI-based JAVA Applications.
    It's displayed as a separate window with its own title bar
        Defined by the JFrame class

A panel is also a container, but it cannot be displayed on its own, it must first be added to another
    container to be displayed.
A panel doesn't move unless you move the container that it's in.

Containers can be classified as either heavyweight or lightweight

    Heavyweight --> More complex than lightweight components in general.
                    Managed by the underlying operating system on which the progrma is run
    Lightweight --> Managed by the Java program itse;f


A label is a component that displays a line of text in a GUI.
    Can also be displayed as an image or other component

---------------------------
JFrame Constructor

The JFrame constructor takes a string as its parameter, which displays the title bar of the frame
Calling the static method setDefaultCloseOperation determines what will happen when the close button in the corner
    of the frame is clicked

A panel is created by instantiating the JPanel class
The background color of the panel is set by using the setBackground method.
The setPreferredSize method accepts a Dimension as the parameter, which is the width and height of the component in px

Labels are creaated by instantiating the JLabel class, passing a constructor as the text of the label.

Containers have an add method that allows other components to be added to them.

The Content Pane of the frame is obtained using the getContentPane method, and then calling the add method to add it to
    the panel

The pack method of the frame sets its size appropriately based on the contents

Every container is managed by calling the layout manager, which determines where the components are layed out.

Unless otherwise specified, the components will attempt to lay themselves next to one another in a row, and will move
    down to the next row only when the width of the panel won't accomodate it.




 */