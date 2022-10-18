package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains the required size dimensions of a logo */
public class OrganizationalMessageLogoDimensions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Maximum height of the logo */
    private Integer _maxHeight;
    /** Maximum width of the logo */
    private Integer _maxWidth;
    /** Minimum height of the logo */
    private Integer _minHeight;
    /** Minimum width of the logo */
    private Integer _minWidth;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new organizationalMessageLogoDimensions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationalMessageLogoDimensions() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.organizationalMessageLogoDimensions");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalMessageLogoDimensions
     */
    @javax.annotation.Nonnull
    public static OrganizationalMessageLogoDimensions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalMessageLogoDimensions();
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
        final OrganizationalMessageLogoDimensions currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("maxHeight", (n) -> { currentObject.setMaxHeight(n.getIntegerValue()); });
            this.put("maxWidth", (n) -> { currentObject.setMaxWidth(n.getIntegerValue()); });
            this.put("minHeight", (n) -> { currentObject.setMinHeight(n.getIntegerValue()); });
            this.put("minWidth", (n) -> { currentObject.setMinWidth(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the maxHeight property value. Maximum height of the logo
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxHeight() {
        return this._maxHeight;
    }
    /**
     * Gets the maxWidth property value. Maximum width of the logo
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxWidth() {
        return this._maxWidth;
    }
    /**
     * Gets the minHeight property value. Minimum height of the logo
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinHeight() {
        return this._minHeight;
    }
    /**
     * Gets the minWidth property value. Minimum width of the logo
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinWidth() {
        return this._minWidth;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("maxHeight", this.getMaxHeight());
        writer.writeIntegerValue("maxWidth", this.getMaxWidth());
        writer.writeIntegerValue("minHeight", this.getMinHeight());
        writer.writeIntegerValue("minWidth", this.getMinWidth());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the maxHeight property value. Maximum height of the logo
     * @param value Value to set for the maxHeight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxHeight(@javax.annotation.Nullable final Integer value) {
        this._maxHeight = value;
    }
    /**
     * Sets the maxWidth property value. Maximum width of the logo
     * @param value Value to set for the maxWidth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxWidth(@javax.annotation.Nullable final Integer value) {
        this._maxWidth = value;
    }
    /**
     * Sets the minHeight property value. Minimum height of the logo
     * @param value Value to set for the minHeight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinHeight(@javax.annotation.Nullable final Integer value) {
        this._minHeight = value;
    }
    /**
     * Sets the minWidth property value. Minimum width of the logo
     * @param value Value to set for the minWidth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinWidth(@javax.annotation.Nullable final Integer value) {
        this._minWidth = value;
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
}
