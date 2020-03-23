package application;

import java.awt.Color;

import Interface.AbortLaunchObjectEvent;
import Interface.ArmRocketObjectEvent;
import Interface.BackGroundController;
import Interface.BackGroundInterface;
import Interface.FillValveClosedObjectEvent;
import Interface.FillValveOpenObjectEvent;
import Interface.LaunchRocketObjectEvent;
import Interface.PurgeValveClosedObjectEvent;
import Interface.PurgeValveObjectEvent;
import Interface.StartAltObjectEvenet;
import Interface.StartGraphObjectEvent;
import Interface.StartOrientationObjectEvent;
import Interface.StartPressureObjectEvent;
import Interface.StopAltObjectEvent;
import Interface.StopGraphObjectEvent;
import Interface.StopOrientationObjectEvent;
import Interface.StopPressureObjectEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class TelemetryScreenController implements BackGroundInterface{

	BackGroundController controller = null;
	
	@FXML
	private Label telemetryStatusLabel;
	@FXML
	private Pane altPane;
	@FXML
	private Label rssiLabel;
	@FXML
	private Label portStatus;
	@FXML
	private StackPane stackPane;
	
	public void setController(BackGroundController controller) {
		this.controller = controller;
	}
	
	@FXML
	public void telemetryStatusNominal() {
		telemetryStatusLabel.setStyle("-fx-background-color: red;");
	
	}
	@FXML
	public void telemetryStatusOffline() {
		telemetryStatusLabel.setStyle("-fx-background-color: red;");
		
	}
	
	@FXML
	private void setRSSI() {
		
	}
	
	public void altitudePaneData() {
		
	}
	
	@FXML
	private void setPortStatusConnected() {
		
	}
	
	@FXML
	private void setPortStatusDisconnected() {
		
	}
	@Override
	public void armRocket(ArmRocketObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void abortLaunch(AbortLaunchObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void launchRocket(LaunchRocketObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void startAlt(StartAltObjectEvenet e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stopAlt(StopAltObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void startOrientation(StartOrientationObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stopOrienatation(StopOrientationObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void startPressure(StartPressureObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stopPressure(StopPressureObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void startGraph(StartGraphObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stopGraph(StopGraphObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fillValveOpen(FillValveOpenObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fillValveClosed(FillValveClosedObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void purgeValveOpen(PurgeValveObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void purgeValveClosed(PurgeValveClosedObjectEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}
