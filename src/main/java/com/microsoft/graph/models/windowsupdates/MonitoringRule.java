package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MonitoringRule implements AdditionalDataHolder, Parsable {
    /** The action triggered when the threshold for the given signal is met. Possible values are: alertError, pauseDeployment, unknownFutureValue. */
    private MonitoringAction _action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The signal to monitor. Possible values are: rollback, unknownFutureValue. */
    private MonitoringSignal _signal;
    /** The threshold for a signal at which to trigger action. An integer from 1 to 100 (inclusive). */
    private Integer _threshold;
    /**
     * Instantiates a new monitoringRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MonitoringRule() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsUpdates.monitoringRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a monitoringRule
     */
    @javax.annotation.Nonnull
    public static MonitoringRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MonitoringRule();
    }
    /**
     * Gets the action property value. The action triggered when the threshold for the given signal is met. Possible values are: alertError, pauseDeployment, unknownFutureValue.
     * @return a monitoringAction
     */
    @javax.annotation.Nullable
    public MonitoringAction getAction() {
        return this._action;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MonitoringRule currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("action", (n) -> { currentObject.setAction(n.getEnumValue(MonitoringAction.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("signal", (n) -> { currentObject.setSignal(n.getEnumValue(MonitoringSignal.class)); });
        deserializerMap.put("threshold", (n) -> { currentObject.setThreshold(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the signal property value. The signal to monitor. Possible values are: rollback, unknownFutureValue.
     * @return a monitoringSignal
     */
    @javax.annotation.Nullable
    public MonitoringSignal getSignal() {
        return this._signal;
    }
    /**
     * Gets the threshold property value. The threshold for a signal at which to trigger action. An integer from 1 to 100 (inclusive).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getThreshold() {
        return this._threshold;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("signal", this.getSignal());
        writer.writeIntegerValue("threshold", this.getThreshold());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action triggered when the threshold for the given signal is met. Possible values are: alertError, pauseDeployment, unknownFutureValue.
     * @param value Value to set for the action property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final MonitoringAction value) {
        this._action = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the signal property value. The signal to monitor. Possible values are: rollback, unknownFutureValue.
     * @param value Value to set for the signal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignal(@javax.annotation.Nullable final MonitoringSignal value) {
        this._signal = value;
    }
    /**
     * Sets the threshold property value. The threshold for a signal at which to trigger action. An integer from 1 to 100 (inclusive).
     * @param value Value to set for the threshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreshold(@javax.annotation.Nullable final Integer value) {
        this._threshold = value;
    }
}
