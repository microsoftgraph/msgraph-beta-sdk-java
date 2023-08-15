package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesDirectorySynchronizationConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Contains the accidental deletion prevention configuration for a tenant.
     */
    private OnPremisesAccidentalDeletionPrevention accidentalDeletionPrevention;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The anchor attribute allows customers to customize the property used to create source anchors for synchronization enabled objects.
     */
    private String anchorAttribute;
    /**
     * The identifier of the on-premises directory synchronization client application that is configured for the tenant.
     */
    private String applicationId;
    /**
     * Data for the current export run.
     */
    private OnPremisesCurrentExportData currentExportData;
    /**
     * Interval of time that the customer requested the sync client waits between sync cycles.
     */
    private PeriodAndDuration customerRequestedSynchronizationInterval;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates the version of the on-premises directory synchronization application.
     */
    private String synchronizationClientVersion;
    /**
     * Interval of time the sync client should honor between sync cycles
     */
    private PeriodAndDuration synchronizationInterval;
    /**
     * Configuration to control how cloud created or owned objects are synchronized back to the on-premises directory.
     */
    private OnPremisesWritebackConfiguration writebackConfiguration;
    /**
     * Instantiates a new onPremisesDirectorySynchronizationConfiguration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public OnPremisesDirectorySynchronizationConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesDirectorySynchronizationConfiguration
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesDirectorySynchronizationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesDirectorySynchronizationConfiguration();
    }
    /**
     * Gets the accidentalDeletionPrevention property value. Contains the accidental deletion prevention configuration for a tenant.
     * @return a onPremisesAccidentalDeletionPrevention
     */
    @jakarta.annotation.Nullable
    public OnPremisesAccidentalDeletionPrevention getAccidentalDeletionPrevention() {
        return this.accidentalDeletionPrevention;
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
     * Gets the anchorAttribute property value. The anchor attribute allows customers to customize the property used to create source anchors for synchronization enabled objects.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAnchorAttribute() {
        return this.anchorAttribute;
    }
    /**
     * Gets the applicationId property value. The identifier of the on-premises directory synchronization client application that is configured for the tenant.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getApplicationId() {
        return this.applicationId;
    }
    /**
     * Gets the currentExportData property value. Data for the current export run.
     * @return a onPremisesCurrentExportData
     */
    @jakarta.annotation.Nullable
    public OnPremisesCurrentExportData getCurrentExportData() {
        return this.currentExportData;
    }
    /**
     * Gets the customerRequestedSynchronizationInterval property value. Interval of time that the customer requested the sync client waits between sync cycles.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getCustomerRequestedSynchronizationInterval() {
        return this.customerRequestedSynchronizationInterval;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the synchronizationClientVersion property value. Indicates the version of the on-premises directory synchronization application.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSynchronizationClientVersion() {
        return this.synchronizationClientVersion;
    }
    /**
     * Gets the synchronizationInterval property value. Interval of time the sync client should honor between sync cycles
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getSynchronizationInterval() {
        return this.synchronizationInterval;
    }
    /**
     * Gets the writebackConfiguration property value. Configuration to control how cloud created or owned objects are synchronized back to the on-premises directory.
     * @return a onPremisesWritebackConfiguration
     */
    @jakarta.annotation.Nullable
    public OnPremisesWritebackConfiguration getWritebackConfiguration() {
        return this.writebackConfiguration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAccidentalDeletionPrevention(@jakarta.annotation.Nullable final OnPremisesAccidentalDeletionPrevention value) {
        this.accidentalDeletionPrevention = value;
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
     * Sets the anchorAttribute property value. The anchor attribute allows customers to customize the property used to create source anchors for synchronization enabled objects.
     * @param value Value to set for the anchorAttribute property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAnchorAttribute(@jakarta.annotation.Nullable final String value) {
        this.anchorAttribute = value;
    }
    /**
     * Sets the applicationId property value. The identifier of the on-premises directory synchronization client application that is configured for the tenant.
     * @param value Value to set for the applicationId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setApplicationId(@jakarta.annotation.Nullable final String value) {
        this.applicationId = value;
    }
    /**
     * Sets the currentExportData property value. Data for the current export run.
     * @param value Value to set for the currentExportData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCurrentExportData(@jakarta.annotation.Nullable final OnPremisesCurrentExportData value) {
        this.currentExportData = value;
    }
    /**
     * Sets the customerRequestedSynchronizationInterval property value. Interval of time that the customer requested the sync client waits between sync cycles.
     * @param value Value to set for the customerRequestedSynchronizationInterval property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCustomerRequestedSynchronizationInterval(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.customerRequestedSynchronizationInterval = value;
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
     * Sets the synchronizationClientVersion property value. Indicates the version of the on-premises directory synchronization application.
     * @param value Value to set for the synchronizationClientVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSynchronizationClientVersion(@jakarta.annotation.Nullable final String value) {
        this.synchronizationClientVersion = value;
    }
    /**
     * Sets the synchronizationInterval property value. Interval of time the sync client should honor between sync cycles
     * @param value Value to set for the synchronizationInterval property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSynchronizationInterval(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.synchronizationInterval = value;
    }
    /**
     * Sets the writebackConfiguration property value. Configuration to control how cloud created or owned objects are synchronized back to the on-premises directory.
     * @param value Value to set for the writebackConfiguration property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWritebackConfiguration(@jakarta.annotation.Nullable final OnPremisesWritebackConfiguration value) {
        this.writebackConfiguration = value;
    }
}
