package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum PrinterProcessingStateReason implements ValuedEnum {
    Paused("paused"),
    MediaJam("mediaJam"),
    MediaNeeded("mediaNeeded"),
    MediaLow("mediaLow"),
    MediaEmpty("mediaEmpty"),
    CoverOpen("coverOpen"),
    InterlockOpen("interlockOpen"),
    OutputTrayMissing("outputTrayMissing"),
    OutputAreaFull("outputAreaFull"),
    MarkerSupplyLow("markerSupplyLow"),
    MarkerSupplyEmpty("markerSupplyEmpty"),
    InputTrayMissing("inputTrayMissing"),
    OutputAreaAlmostFull("outputAreaAlmostFull"),
    MarkerWasteAlmostFull("markerWasteAlmostFull"),
    MarkerWasteFull("markerWasteFull"),
    FuserOverTemp("fuserOverTemp"),
    FuserUnderTemp("fuserUnderTemp"),
    Other("other"),
    None("none"),
    MovingToPaused("movingToPaused"),
    Shutdown("shutdown"),
    ConnectingToDevice("connectingToDevice"),
    TimedOut("timedOut"),
    Stopping("stopping"),
    StoppedPartially("stoppedPartially"),
    TonerLow("tonerLow"),
    TonerEmpty("tonerEmpty"),
    SpoolAreaFull("spoolAreaFull"),
    DoorOpen("doorOpen"),
    OpticalPhotoConductorNearEndOfLife("opticalPhotoConductorNearEndOfLife"),
    OpticalPhotoConductorLifeOver("opticalPhotoConductorLifeOver"),
    DeveloperLow("developerLow"),
    DeveloperEmpty("developerEmpty"),
    InterpreterResourceUnavailable("interpreterResourceUnavailable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrinterProcessingStateReason(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrinterProcessingStateReason forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "paused": return Paused;
            case "mediaJam": return MediaJam;
            case "mediaNeeded": return MediaNeeded;
            case "mediaLow": return MediaLow;
            case "mediaEmpty": return MediaEmpty;
            case "coverOpen": return CoverOpen;
            case "interlockOpen": return InterlockOpen;
            case "outputTrayMissing": return OutputTrayMissing;
            case "outputAreaFull": return OutputAreaFull;
            case "markerSupplyLow": return MarkerSupplyLow;
            case "markerSupplyEmpty": return MarkerSupplyEmpty;
            case "inputTrayMissing": return InputTrayMissing;
            case "outputAreaAlmostFull": return OutputAreaAlmostFull;
            case "markerWasteAlmostFull": return MarkerWasteAlmostFull;
            case "markerWasteFull": return MarkerWasteFull;
            case "fuserOverTemp": return FuserOverTemp;
            case "fuserUnderTemp": return FuserUnderTemp;
            case "other": return Other;
            case "none": return None;
            case "movingToPaused": return MovingToPaused;
            case "shutdown": return Shutdown;
            case "connectingToDevice": return ConnectingToDevice;
            case "timedOut": return TimedOut;
            case "stopping": return Stopping;
            case "stoppedPartially": return StoppedPartially;
            case "tonerLow": return TonerLow;
            case "tonerEmpty": return TonerEmpty;
            case "spoolAreaFull": return SpoolAreaFull;
            case "doorOpen": return DoorOpen;
            case "opticalPhotoConductorNearEndOfLife": return OpticalPhotoConductorNearEndOfLife;
            case "opticalPhotoConductorLifeOver": return OpticalPhotoConductorLifeOver;
            case "developerLow": return DeveloperLow;
            case "developerEmpty": return DeveloperEmpty;
            case "interpreterResourceUnavailable": return InterpreterResourceUnavailable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
