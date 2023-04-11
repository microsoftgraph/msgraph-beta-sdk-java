package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesDirectorySynchronizationConfiguration implements AdditionalDataHolder, Parsable {
    /** Contains the accidental deletion prevention configuration for a tenant. */
    private OnPremisesAccidentalDeletionPrevention accidentalDeletionPrevention;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Interval of time that the customer requested the sync client waits between sync cycles. */
    private Period customerRequestedSynchronizationInterval;
    /** The OdataType property */
    private String odataType;
    /** Interval of time the sync client should honor between sync cycles */
    private Period synchronizationInterval;
    /**
     * Instantiates a new onPremisesDirectorySynchronizationConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesDirectorySynchronizationConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesDirectorySynchronizationConfiguration
     */
    @javax.annotation.Nonnull
    public static OnPremisesDirectorySynchronizationConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesDirectorySynchronizationConfiguration();
    }
    /**
     * Gets the accidentalDeletionPrevention property value. Contains the accidental deletion prevention configuration for a tenant.
     * @return a onPremisesAccidentalDeletionPrevention
     */
    @javax.annotation.Nullable
    public OnPremisesAccidentalDeletionPrevention getAccidentalDeletionPrevention() {
        return this.accidentalDeletionPrevention;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the customerRequestedSynchronizationInterval property value. Interval of time that the customer requested the sync client waits between sync cycles.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getCustomerRequestedSynchronizationInterval() {
        return this.customerRequestedSynchronizationInterval;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("accidentalDeletionPrevention", (n) -> { this.setAccidentalDeletionPrevention(n.getObjectValue(OnPremisesAccidentalDeletionPrevention::createFromDiscriminatorValue)); });
        deserializerMap.put("customerRequestedSynchronizationInterval", (n) -> { this.setCustomerRequestedSynchronizationInterval(n.getPeriodValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("synchronizationInterval", (n) -> { this.setSynchronizationInterval(n.getPeriodValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the synchronizationInterval property value. Interval of time the sync client should honor between sync cycles
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getSynchronizationInterval() {
        return this.synchronizationInterval;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accidentalDeletionPrevention", this.getAccidentalDeletionPrevention());
        writer.writePeriodValue("customerRequestedSynchronizationInterval", this.getCustomerRequestedSynchronizationInterval());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writePeriodValue("synchronizationInterval", this.getSynchronizationInterval());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accidentalDeletionPrevention property value. Contains the accidental deletion prevention configuration for a tenant.
     * @param value Value to set for the accidentalDeletionPrevention property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccidentalDeletionPrevention(@javax.annotation.Nullable final OnPremisesAccidentalDeletionPrevention value) {
        this.accidentalDeletionPrevention = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the customerRequestedSynchronizationInterval property value. Interval of time that the customer requested the sync client waits between sync cycles.
     * @param value Value to set for the customerRequestedSynchronizationInterval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerRequestedSynchronizationInterval(@javax.annotation.Nullable final Period value) {
        this.customerRequestedSynchronizationInterval = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the synchronizationInterval property value. Interval of time the sync client should honor between sync cycles
     * @param value Value to set for the synchronizationInterval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSynchronizationInterval(@javax.annotation.Nullable final Period value) {
        this.synchronizationInterval = value;
    }
}
