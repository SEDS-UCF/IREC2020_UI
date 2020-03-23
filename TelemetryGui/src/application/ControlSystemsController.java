package application;

import com.sun.prism.paint.Color;

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
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;

public class ControlSystemsController implements BackGroundInterface {
	
	BackGroundController controller = null;
	
	private boolean abortLaunch = false;
	
	@FXML
	private Button startAltButton;
	@FXML
	private Button stopAltButton;
	@FXML
	private Button startOrientationButton;
	@FXML
	private Button stopOrientationButton;
	@FXML
	private Button startPressureButton;
	@FXML
	private Button stopPressureButton;
	@FXML
	private Button startGraphButton;
	@FXML
	private Button stopGraphButton;
	@FXML
	private Button fillValveOpen;
	@FXML
	private Button fillValveClosed;
	@FXML
	private Label altDataStatus;
	@FXML 
	private Label orientationLabel;
	@FXML 
	private Label pressureLabel;
	@FXML 
	private Label graphLabel;
	@FXML
	private Label fillValveLabel;
	@FXML
	private Label purgeValveLabel;
	@FXML
	private Label camera1Label;
	@FXML
	private Label camera2Label;
	
	public void setController(BackGroundController controller) {
		this.controller = controller;
	}
	
	@FXML
	private void altDataGo() {
		altDataStatus.setStyle("-fx-background-color: green");
		
	}
	
	@FXML
	private void altDataStop() {
		altDataStatus.setStyle("-fx-background-color: red");
		
	}
	
	@FXML
	private void orientationStart() {
		orientationLabel.setStyle("-fx-background-color: green");
	}
	
	@FXML
	private void orientationStop() {
		orientationLabel.setStyle("-fx-background-color: red");
	}
	
	@FXML
	private void pressureStart() {
		pressureLabel.setStyle("-fx-background-color: green");
		
	}
	
	@FXML
	private void pressureStop() {
		pressureLabel.setStyle("-fx-background-color: red");
	}
	
	@FXML
	private void graphStart() {
		graphLabel.setStyle("-fx-background-color: green");
	}
	
	@FXML
	private void graphStop() {
		graphLabel.setStyle("-fx-background-color: red");
	}
	
	
	
	@FXML
	private void openFillValve() {
		fillValveLabel.setStyle("-fx-background-color: green");
		controller.fillValveOpen();
		
	}
	
	@FXML
	private void closeFillValve() {
		fillValveLabel.setStyle("-fx-background-color: red");
		controller.fillValveClosed();
		
	}
	
	@FXML
	private void openPurgeValve() {
		purgeValveLabel.setStyle("-fx-background-color: green");
	}
	
	@FXML
	private void closePurgeValve() {
		purgeValveLabel.setStyle("-fx-background-color: red");
	}
	@FXML
	private void camera1On() {
		camera1Label.setStyle("-fx-background-color: green");
	}
	@FXML
	private void camera1Off() {
		camera1Label.setStyle("-fx-background-color: red");
	}
	@FXML
	private void camera2On() {
		camera2Label.setStyle("-fx-background-color: green");
	}
	@FXML
	private void camera2Off() {
		camera2Label.setStyle("-fx-background-color: red");
	}
	
	@FXML
	private void armRocket() {
		controller.armRocket();
		
	}

	@FXML
	private void abortLaunch() {
		controller.abortLaunch();
	}
	
	@FXML
	private void launchRocket() {
		controller.launchRocket();
	}

	@Override
	public void armRocket(ArmRocketObjectEvent e) {
		
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
