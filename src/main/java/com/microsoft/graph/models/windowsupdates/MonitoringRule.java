package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MonitoringRule implements AdditionalDataHolder, Parsable {
    /**
     * The action triggered when the threshold for the given signal is met. Possible values are: alertError, pauseDeployment, unknownFutureValue.
     */
    private MonitoringAction action;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The signal to monitor. Possible values are: rollback, unknownFutureValue.
     */
    private MonitoringSignal signal;
    /**
     * The threshold for a signal at which to trigger action. An integer from 1 to 100 (inclusive).
     */
    private Integer threshold;
    /**
     * Instantiates a new monitoringRule and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MonitoringRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a monitoringRule
     */
    @jakarta.annotation.Nonnull
    public static MonitoringRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MonitoringRule();
    }
    /**
     * Gets the action property value. The action triggered when the threshold for the given signal is met. Possible values are: alertError, pauseDeployment, unknownFutureValue.
     * @return a monitoringAction
     */
    @jakarta.annotation.Nullable
    public MonitoringAction getAction() {
        return this.action;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(MonitoringAction.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("signal", (n) -> { this.setSignal(n.getEnumValue(MonitoringSignal.class)); });
        deserializerMap.put("threshold", (n) -> { this.setThreshold(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the signal property value. The signal to monitor. Possible values are: rollback, unknownFutureValue.
     * @return a monitoringSignal
     */
    @jakarta.annotation.Nullable
    public MonitoringSignal getSignal() {
        return this.signal;
    }
    /**
     * Gets the threshold property value. The threshold for a signal at which to trigger action. An integer from 1 to 100 (inclusive).
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreshold() {
        return this.threshold;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setAction(@jakarta.annotation.Nullable final MonitoringAction value) {
        this.action = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the signal property value. The signal to monitor. Possible values are: rollback, unknownFutureValue.
     * @param value Value to set for the signal property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSignal(@jakarta.annotation.Nullable final MonitoringSignal value) {
        this.signal = value;
    }
    /**
     * Sets the threshold property value. The threshold for a signal at which to trigger action. An integer from 1 to 100 (inclusive).
     * @param value Value to set for the threshold property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setThreshold(@jakarta.annotation.Nullable final Integer value) {
        this.threshold = value;
    }
}
