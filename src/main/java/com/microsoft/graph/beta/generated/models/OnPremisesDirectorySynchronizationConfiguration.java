package com.microsoft.graph.beta.models;

import com.microsoft.kiota.PeriodAndDuration;
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
public class OnPremisesDirectorySynchronizationConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OnPremisesDirectorySynchronizationConfiguration} and sets the default values.
     */
    public OnPremisesDirectorySynchronizationConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPremisesDirectorySynchronizationConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesDirectorySynchronizationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesDirectorySynchronizationConfiguration();
    }
    /**
     * Gets the accidentalDeletionPrevention property value. Contains the accidental deletion prevention configuration for a tenant.
     * @return a {@link OnPremisesAccidentalDeletionPrevention}
     */
    @jakarta.annotation.Nullable
    public OnPremisesAccidentalDeletionPrevention getAccidentalDeletionPrevention() {
        return this.backingStore.get("accidentalDeletionPrevention");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the anchorAttribute property value. The anchor attribute allows customers to customize the property used to create source anchors for synchronization enabled objects.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAnchorAttribute() {
        return this.backingStore.get("anchorAttribute");
    }
    /**
     * Gets the applicationId property value. The identifier of the on-premises directory synchronization client application that is configured for the tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationId() {
        return this.backingStore.get("applicationId");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the currentExportData property value. Data for the current export run.
     * @return a {@link OnPremisesCurrentExportData}
     */
    @jakarta.annotation.Nullable
    public OnPremisesCurrentExportData getCurrentExportData() {
        return this.backingStore.get("currentExportData");
    }
    /**
     * Gets the customerRequestedSynchronizationInterval property value. Interval of time that the customer requested the sync client waits between sync cycles.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getCustomerRequestedSynchronizationInterval() {
        return this.backingStore.get("customerRequestedSynchronizationInterval");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("accidentalDeletionPrevention", (n) -> { this.setAccidentalDeletionPrevention(n.getObjectValue(OnPremisesAccidentalDeletionPrevention::createFromDiscriminatorValue)); });
        deserializerMap.put("anchorAttribute", (n) -> { this.setAnchorAttribute(n.getStringValue()); });
        deserializerMap.put("applicationId", (n) -> { this.setApplicationId(n.getStringValue()); });
        deserializerMap.put("currentExportData", (n) -> { this.setCurrentExportData(n.getObjectValue(OnPremisesCurrentExportData::createFromDiscriminatorValue)); });
        deserializerMap.put("customerRequestedSynchronizationInterval", (n) -> { this.setCustomerRequestedSynchronizationInterval(n.getPeriodAndDurationValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("synchronizationClientVersion", (n) -> { this.setSynchronizationClientVersion(n.getStringValue()); });
        deserializerMap.put("synchronizationInterval", (n) -> { this.setSynchronizationInterval(n.getPeriodAndDurationValue()); });
        deserializerMap.put("writebackConfiguration", (n) -> { this.setWritebackConfiguration(n.getObjectValue(OnPremisesWritebackConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the synchronizationClientVersion property value. Indicates the version of the on-premises directory synchronization application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSynchronizationClientVersion() {
        return this.backingStore.get("synchronizationClientVersion");
    }
    /**
     * Gets the synchronizationInterval property value. Interval of time the sync client should honor between sync cycles
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getSynchronizationInterval() {
        return this.backingStore.get("synchronizationInterval");
    }
    /**
     * Gets the writebackConfiguration property value. Configuration to control how cloud created or owned objects are synchronized back to the on-premises directory.
     * @return a {@link OnPremisesWritebackConfiguration}
     */
    @jakarta.annotation.Nullable
    public OnPremisesWritebackConfiguration getWritebackConfiguration() {
        return this.backingStore.get("writebackConfiguration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accidentalDeletionPrevention", this.getAccidentalDeletionPrevention());
        writer.writeStringValue("anchorAttribute", this.getAnchorAttribute());
        writer.writeStringValue("applicationId", this.getApplicationId());
        writer.writeObjectValue("currentExportData", this.getCurrentExportData());
        writer.writePeriodAndDurationValue("customerRequestedSynchronizationInterval", this.getCustomerRequestedSynchronizationInterval());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("synchronizationClientVersion", this.getSynchronizationClientVersion());
        writer.writePeriodAndDurationValue("synchronizationInterval", this.getSynchronizationInterval());
        writer.writeObjectValue("writebackConfiguration", this.getWritebackConfiguration());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accidentalDeletionPrevention property value. Contains the accidental deletion prevention configuration for a tenant.
     * @param value Value to set for the accidentalDeletionPrevention property.
     */
    public void setAccidentalDeletionPrevention(@jakarta.annotation.Nullable final OnPremisesAccidentalDeletionPrevention value) {
        this.backingStore.set("accidentalDeletionPrevention", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the anchorAttribute property value. The anchor attribute allows customers to customize the property used to create source anchors for synchronization enabled objects.
     * @param value Value to set for the anchorAttribute property.
     */
    public void setAnchorAttribute(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("anchorAttribute", value);
    }
    /**
     * Sets the applicationId property value. The identifier of the on-premises directory synchronization client application that is configured for the tenant.
     * @param value Value to set for the applicationId property.
     */
    public void setApplicationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationId", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the currentExportData property value. Data for the current export run.
     * @param value Value to set for the currentExportData property.
     */
    public void setCurrentExportData(@jakarta.annotation.Nullable final OnPremisesCurrentExportData value) {
        this.backingStore.set("currentExportData", value);
    }
    /**
     * Sets the customerRequestedSynchronizationInterval property value. Interval of time that the customer requested the sync client waits between sync cycles.
     * @param value Value to set for the customerRequestedSynchronizationInterval property.
     */
    public void setCustomerRequestedSynchronizationInterval(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("customerRequestedSynchronizationInterval", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the synchronizationClientVersion property value. Indicates the version of the on-premises directory synchronization application.
     * @param value Value to set for the synchronizationClientVersion property.
     */
    public void setSynchronizationClientVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("synchronizationClientVersion", value);
    }
    /**
     * Sets the synchronizationInterval property value. Interval of time the sync client should honor between sync cycles
     * @param value Value to set for the synchronizationInterval property.
     */
    public void setSynchronizationInterval(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("synchronizationInterval", value);
    }
    /**
     * Sets the writebackConfiguration property value. Configuration to control how cloud created or owned objects are synchronized back to the on-premises directory.
     * @param value Value to set for the writebackConfiguration property.
     */
    public void setWritebackConfiguration(@jakarta.annotation.Nullable final OnPremisesWritebackConfiguration value) {
        this.backingStore.set("writebackConfiguration", value);
    }
}
