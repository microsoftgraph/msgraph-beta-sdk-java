package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SensitiveContentLocation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The confidence property */
    private Integer _confidence;
    /** The evidences property */
    private java.util.List<SensitiveContentEvidence> _evidences;
    /** The idMatch property */
    private String _idMatch;
    /** The length property */
    private Integer _length;
    /** The OdataType property */
    private String _odataType;
    /** The offset property */
    private Integer _offset;
    /**
     * Instantiates a new sensitiveContentLocation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SensitiveContentLocation() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.sensitiveContentLocation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sensitiveContentLocation
     */
    @javax.annotation.Nonnull
    public static SensitiveContentLocation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitiveContentLocation();
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
     * Gets the confidence property value. The confidence property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfidence() {
        return this._confidence;
    }
    /**
     * Gets the evidences property value. The evidences property
     * @return a sensitiveContentEvidence
     */
    @javax.annotation.Nullable
    public java.util.List<SensitiveContentEvidence> getEvidences() {
        return this._evidences;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SensitiveContentLocation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("confidence", (n) -> { currentObject.setConfidence(n.getIntegerValue()); });
            this.put("evidences", (n) -> { currentObject.setEvidences(n.getCollectionOfObjectValues(SensitiveContentEvidence::createFromDiscriminatorValue)); });
            this.put("idMatch", (n) -> { currentObject.setIdMatch(n.getStringValue()); });
            this.put("length", (n) -> { currentObject.setLength(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("offset", (n) -> { currentObject.setOffset(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the idMatch property value. The idMatch property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdMatch() {
        return this._idMatch;
    }
    /**
     * Gets the length property value. The length property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLength() {
        return this._length;
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
     * Gets the offset property value. The offset property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOffset() {
        return this._offset;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("confidence", this.getConfidence());
        writer.writeCollectionOfObjectValues("evidences", this.getEvidences());
        writer.writeStringValue("idMatch", this.getIdMatch());
        writer.writeIntegerValue("length", this.getLength());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("offset", this.getOffset());
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
     * Sets the confidence property value. The confidence property
     * @param value Value to set for the confidence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfidence(@javax.annotation.Nullable final Integer value) {
        this._confidence = value;
    }
    /**
     * Sets the evidences property value. The evidences property
     * @param value Value to set for the evidences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvidences(@javax.annotation.Nullable final java.util.List<SensitiveContentEvidence> value) {
        this._evidences = value;
    }
    /**
     * Sets the idMatch property value. The idMatch property
     * @param value Value to set for the idMatch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdMatch(@javax.annotation.Nullable final String value) {
        this._idMatch = value;
    }
    /**
     * Sets the length property value. The length property
     * @param value Value to set for the length property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLength(@javax.annotation.Nullable final Integer value) {
        this._length = value;
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
     * Sets the offset property value. The offset property
     * @param value Value to set for the offset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffset(@javax.annotation.Nullable final Integer value) {
        this._offset = value;
    }
}
