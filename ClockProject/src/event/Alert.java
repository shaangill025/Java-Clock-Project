package event;

import java.util.Date;

public class Alert implements Event {
  Date time = null;
  String action = null;
  String entity = null;
  String type = null;

  public Alert(Date time, String action, String entity, String type) {
    this.time = time;
    this.action = action;
    this.entity = entity;
    this.type = type;
  }

  @Override
  public void Trigger() {
      // Trigger ActionEvent
      // ActionEvent's definition is action
   }

  @Override
  public int compareTo(Event o) {
  	// TODO Auto-generated method stub
  	return 0;
  }
}