void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
pinMode(11,OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  while(Serial.available())
  {
    char c=Serial.read();
    if(c=='a')
    {
      digitalWrite(11,HIGH);
    }
    if(c=='b')
    {
      digitalWrite(11,LOW);
    }
    Serial.print(c);
  }
}
