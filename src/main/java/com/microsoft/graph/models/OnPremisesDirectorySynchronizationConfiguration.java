package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesDirectorySynchronizationConfiguration implements AdditionalDataHolder, Parsable {
    /** The accidentalDeletionPrevention property */
    private OnPremisesAccidentalDeletionPrevention _accidentalDeletionPrevention;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The customerRequestedSynchronizationInterval property */
    private Period _customerRequestedSynchronizationInterval;
    /** The OdataType property */
    private String _odataType;
    /** The synchronizationInterval property */
    private Period _synchronizationInterval;
    /**
     * Instantiates a new onPremisesDirectorySynchronizationConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesDirectorySynchronizationConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.onPremisesDirectorySynchronizationConfiguration");
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
     * Gets the accidentalDeletionPrevention property value. The accidentalDeletionPrevention property
     * @return a onPremisesAccidentalDeletionPrevention
     */
    @javax.annotation.Nullable
    public OnPremisesAccidentalDeletionPrevention getAccidentalDeletionPrevention() {
        return this._accidentalDeletionPrevention;
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
     * Gets the customerRequestedSynchronizationInterval property value. The customerRequestedSynchronizationInterval property
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getCustomerRequestedSynchronizationInterval() {
        return this._customerRequestedSynchronizationInterval;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesDirectorySynchronizationConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("accidentalDeletionPrevention", (n) -> { currentObject.setAccidentalDeletionPrevention(n.getObjectValue(OnPremisesAccidentalDeletionPrevention::createFromDiscriminatorValue)); });
        deserializerMap.put("customerRequestedSynchronizationInterval", (n) -> { currentObject.setCustomerRequestedSynchronizationInterval(n.getPeriodValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("synchronizationInterval", (n) -> { currentObject.setSynchronizationInterval(n.getPeriodValue()); });
        return deserializerMap
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
     * Gets the synchronizationInterval property value. The synchronizationInterval property
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getSynchronizationInterval() {
        return this._synchronizationInterval;
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
     * Sets the accidentalDeletionPrevention property value. The accidentalDeletionPrevention property
     * @param value Value to set for the accidentalDeletionPrevention property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccidentalDeletionPrevention(@javax.annotation.Nullable final OnPremisesAccidentalDeletionPrevention value) {
        this._accidentalDeletionPrevention = value;
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
     * Sets the customerRequestedSynchronizationInterval property value. The customerRequestedSynchronizationInterval property
     * @param value Value to set for the customerRequestedSynchronizationInterval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerRequestedSynchronizationInterval(@javax.annotation.Nullable final Period value) {
        this._customerRequestedSynchronizationInterval = value;
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
     * Sets the synchronizationInterval property value. The synchronizationInterval property
     * @param value Value to set for the synchronizationInterval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSynchronizationInterval(@javax.annotation.Nullable final Period value) {
        this._synchronizationInterval = value;
    }
}
