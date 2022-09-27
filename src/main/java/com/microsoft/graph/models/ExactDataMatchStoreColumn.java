package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExactDataMatchStoreColumn implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The ignoredDelimiters property */
    private java.util.List<String> _ignoredDelimiters;
    /** The isCaseInsensitive property */
    private Boolean _isCaseInsensitive;
    /** The isSearchable property */
    private Boolean _isSearchable;
    /** The name property */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new exactDataMatchStoreColumn and sets the default values.
     * @return a void
     */
    public ExactDataMatchStoreColumn() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.exactDataMatchStoreColumn");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a exactDataMatchStoreColumn
     */
    @javax.annotation.Nonnull
    public static ExactDataMatchStoreColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactDataMatchStoreColumn();
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
        final ExactDataMatchStoreColumn currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("ignoredDelimiters", (n) -> { currentObject.setIgnoredDelimiters(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("isCaseInsensitive", (n) -> { currentObject.setIsCaseInsensitive(n.getBooleanValue()); });
            this.put("isSearchable", (n) -> { currentObject.setIsSearchable(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ignoredDelimiters property value. The ignoredDelimiters property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIgnoredDelimiters() {
        return this._ignoredDelimiters;
    }
    /**
     * Gets the isCaseInsensitive property value. The isCaseInsensitive property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCaseInsensitive() {
        return this._isCaseInsensitive;
    }
    /**
     * Gets the isSearchable property value. The isSearchable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSearchable() {
        return this._isSearchable;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("ignoredDelimiters", this.getIgnoredDelimiters());
        writer.writeBooleanValue("isCaseInsensitive", this.getIsCaseInsensitive());
        writer.writeBooleanValue("isSearchable", this.getIsSearchable());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the ignoredDelimiters property value. The ignoredDelimiters property
     * @param value Value to set for the ignoredDelimiters property.
     * @return a void
     */
    public void setIgnoredDelimiters(@javax.annotation.Nullable final java.util.List<String> value) {
        this._ignoredDelimiters = value;
    }
    /**
     * Sets the isCaseInsensitive property value. The isCaseInsensitive property
     * @param value Value to set for the isCaseInsensitive property.
     * @return a void
     */
    public void setIsCaseInsensitive(@javax.annotation.Nullable final Boolean value) {
        this._isCaseInsensitive = value;
    }
    /**
     * Sets the isSearchable property value. The isSearchable property
     * @param value Value to set for the isSearchable property.
     * @return a void
     */
    public void setIsSearchable(@javax.annotation.Nullable final Boolean value) {
        this._isSearchable = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
