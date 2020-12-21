#include <iostream>
#include <string>

using namespace std;

class GameSetting {
    static GameSetting* _instance;
    int _brightness;
    int _width;
    int _height;
    GameSetting () : _width(100), _height(100), _brightness(50) {}

    public:
    static GameSetting* getInstance() {
        if (_instance == NULL) 
            _instance = new GameSetting();
        return _instance;
    }
    void setWidth(int width) { _width = width; }
    void setHeight(int height) { _height = height; }
    void setBrightness(int brightness) { _brightness = brightness; } 

    int getWidth() { return _width; };
    int getHeight() { return _height; };
    int getBrightness() { return _brightness; };
    void display () {
        cout << _brightness  << " " << _height << " " << _width << endl;
    }
};

GameSetting * GameSetting::_instance = NULL;

void someFunction () {
    GameSetting *setting = GameSetting::getInstance();
    setting->display();
}

int main () {
    GameSetting *setting = GameSetting::getInstance();
    setting->display();
    setting->setBrightness(75);
    someFunction();

    return 0; 
}