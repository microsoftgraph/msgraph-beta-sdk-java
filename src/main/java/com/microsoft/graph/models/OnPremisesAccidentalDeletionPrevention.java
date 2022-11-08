package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesAccidentalDeletionPrevention implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The alertThreshold property */
    private Integer _alertThreshold;
    /** The OdataType property */
    private String _odataType;
    /** The synchronizationPreventionType property */
    private OnPremisesDirectorySynchronizationDeletionPreventionType _synchronizationPreventionType;
    /**
     * Instantiates a new onPremisesAccidentalDeletionPrevention and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesAccidentalDeletionPrevention() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.onPremisesAccidentalDeletionPrevention");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesAccidentalDeletionPrevention
     */
    @javax.annotation.Nonnull
    public static OnPremisesAccidentalDeletionPrevention createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesAccidentalDeletionPrevention();
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
     * Gets the alertThreshold property value. The alertThreshold property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAlertThreshold() {
        return this._alertThreshold;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesAccidentalDeletionPrevention currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("alertThreshold", (n) -> { currentObject.setAlertThreshold(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("synchronizationPreventionType", (n) -> { currentObject.setSynchronizationPreventionType(n.getEnumValue(OnPremisesDirectorySynchronizationDeletionPreventionType.class)); });
        }};
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
     * Gets the synchronizationPreventionType property value. The synchronizationPreventionType property
     * @return a onPremisesDirectorySynchronizationDeletionPreventionType
     */
    @javax.annotation.Nullable
    public OnPremisesDirectorySynchronizationDeletionPreventionType getSynchronizationPreventionType() {
        return this._synchronizationPreventionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("alertThreshold", this.getAlertThreshold());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("synchronizationPreventionType", this.getSynchronizationPreventionType());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the alertThreshold property value. The alertThreshold property
     * @param value Value to set for the alertThreshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertThreshold(@javax.annotation.Nullable final Integer value) {
        this._alertThreshold = value;
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
     * Sets the synchronizationPreventionType property value. The synchronizationPreventionType property
     * @param value Value to set for the synchronizationPreventionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSynchronizationPreventionType(@javax.annotation.Nullable final OnPremisesDirectorySynchronizationDeletionPreventionType value) {
        this._synchronizationPreventionType = value;
    }
}
