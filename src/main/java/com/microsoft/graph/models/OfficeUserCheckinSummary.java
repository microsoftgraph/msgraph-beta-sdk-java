package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeUserCheckinSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Total failed user check ins for the last 3 months. */
    private Integer _failedUserCount;
    /** The OdataType property */
    private String _odataType;
    /** Total successful user check ins for the last 3 months. */
    private Integer _succeededUserCount;
    /**
     * Instantiates a new officeUserCheckinSummary and sets the default values.
     * @return a void
     */
    public OfficeUserCheckinSummary() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.officeUserCheckinSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a officeUserCheckinSummary
     */
    @javax.annotation.Nonnull
    public static OfficeUserCheckinSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfficeUserCheckinSummary();
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
     * Gets the failedUserCount property value. Total failed user check ins for the last 3 months.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedUserCount() {
        return this._failedUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OfficeUserCheckinSummary currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("failedUserCount", (n) -> { currentObject.setFailedUserCount(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("succeededUserCount", (n) -> { currentObject.setSucceededUserCount(n.getIntegerValue()); });
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
     * Gets the succeededUserCount property value. Total successful user check ins for the last 3 months.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSucceededUserCount() {
        return this._succeededUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedUserCount", this.getFailedUserCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("succeededUserCount", this.getSucceededUserCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the failedUserCount property value. Total failed user check ins for the last 3 months.
     * @param value Value to set for the failedUserCount property.
     * @return a void
     */
    public void setFailedUserCount(@javax.annotation.Nullable final Integer value) {
        this._failedUserCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the succeededUserCount property value. Total successful user check ins for the last 3 months.
     * @param value Value to set for the succeededUserCount property.
     * @return a void
     */
    public void setSucceededUserCount(@javax.annotation.Nullable final Integer value) {
        this._succeededUserCount = value;
    }
}
