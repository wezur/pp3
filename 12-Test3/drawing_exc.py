import turtle
import math
local_turtle = turtle.Turtle()


def initialize(line_color, fill_color, x, y, angle):
    local_turtle.up()
    local_turtle.goto(x, y)
    local_turtle.down()
    local_turtle.setheading(angle)
    local_turtle.color(line_color)
    local_turtle.fillcolor(fill_color)

def draw_square(size, line_color, fill_color, x, y, angle):
    initialize(line_color, fill_color, x, y, angle)
    local_turtle.begin_fill()
    for _ in range(4):
        local_turtle.forward(size)
        local_turtle.left(90)
    local_turtle.end_fill()

def draw_right(size, line_color, fill_color, x, y, angle):
    initialize(line_color, fill_color, x, y, angle)
    local_turtle.begin_fill()
    local_turtle.forward(size)
    local_turtle.left(135)
    local_turtle.forward(size*math.sqrt(2))
    local_turtle.left(135)
    local_turtle.forward(size)
    local_turtle.end_fill()

def draw_trefoil(size, line_color, fill_color, x, y, angle):
    initialize(line_color, fill_color, x, y, angle)
    local_turtle.begin_fill()
    for _ in range(3):
        local_turtle.circle(size, 240)
        local_turtle.right(120)
    local_turtle.end_fill()

def draw_cross(size, line_color, fill_color, x, y, angle):
    initialize(line_color, fill_color, x, y, angle)
    local_turtle.begin_fill()
    for _ in range(4):
        local_turtle.forward(size)
        local_turtle.left(90)
        local_turtle.forward(size)
        local_turtle.right(90)
        local_turtle.forward(size)
        local_turtle.left(90)
    local_turtle.end_fill()  

def draw_rhombus(size, line_color, fill_color, x, y, angle):
    initialize(line_color, fill_color, x, y, angle)
    local_turtle.begin_fill()
    local_turtle.right(45)
    for _ in range(4):
        local_turtle.forward(size)
        local_turtle.left(90)
    local_turtle.end_fill()  


draw_square(30, "yellow", "purple", -20, 40, 10)
draw_right(25, "black", "yellow", 70, 30, 15)
draw_trefoil(40, "red", "red", -40, 30, 25)
draw_cross(35, "blue", "red", -40, 30, 25)
draw_rhombus(40, "green", "red", 20, 40, 0)
