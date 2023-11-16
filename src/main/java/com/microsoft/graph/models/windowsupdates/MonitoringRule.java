package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MonitoringRule implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new MonitoringRule and sets the default values.
     */
    public MonitoringRule() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MonitoringRule
     */
    @jakarta.annotation.Nonnull
    public static MonitoringRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MonitoringRule();
    }
    /**
     * Gets the action property value. The action triggered when the threshold for the given signal is reached. Possible values are: alertError, pauseDeployment, offerFallback, unknownFutureValue. The offerFallback member is only supported on feature update deployments of Windows 11 and must be paired with the ineligible signal. The fallback version offered is the version 22H2 of Windows 10.
     * @return a MonitoringAction
     */
    @jakarta.annotation.Nullable
    public MonitoringAction getAction() {
        return this.BackingStore.get("action");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the signal property value. The signal to monitor. Possible values are: rollback, ineligible, unknownFutureValue. The ineligible member is only supported on feature update deployments of Windows 11 and must be paired with the offerFallback action.
     * @return a MonitoringSignal
     */
    @jakarta.annotation.Nullable
    public MonitoringSignal getSignal() {
        return this.BackingStore.get("signal");
    }
    /**
     * Gets the threshold property value. The threshold for a signal at which to trigger the action. An integer from 1 to 100 (inclusive). This value is ignored when the signal is ineligible and the action is offerFallback.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreshold() {
        return this.BackingStore.get("threshold");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("signal", this.getSignal());
        writer.writeIntegerValue("threshold", this.getThreshold());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action triggered when the threshold for the given signal is reached. Possible values are: alertError, pauseDeployment, offerFallback, unknownFutureValue. The offerFallback member is only supported on feature update deployments of Windows 11 and must be paired with the ineligible signal. The fallback version offered is the version 22H2 of Windows 10.
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final MonitoringAction value) {
        this.BackingStore.set("action", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the signal property value. The signal to monitor. Possible values are: rollback, ineligible, unknownFutureValue. The ineligible member is only supported on feature update deployments of Windows 11 and must be paired with the offerFallback action.
     * @param value Value to set for the signal property.
     */
    public void setSignal(@jakarta.annotation.Nullable final MonitoringSignal value) {
        this.BackingStore.set("signal", value);
    }
    /**
     * Sets the threshold property value. The threshold for a signal at which to trigger the action. An integer from 1 to 100 (inclusive). This value is ignored when the signal is ineligible and the action is offerFallback.
     * @param value Value to set for the threshold property.
     */
    public void setThreshold(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("threshold", value);
    }
}
