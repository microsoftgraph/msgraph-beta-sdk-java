package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PostalAddressType implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The city property */
    private String _city;
    /** The countryLetterCode property */
    private String _countryLetterCode;
    /** The OdataType property */
    private String _odataType;
    /** The postalCode property */
    private String _postalCode;
    /** The state property */
    private String _state;
    /** The street property */
    private String _street;
    /**
     * Instantiates a new postalAddressType and sets the default values.
     * @return a void
     */
    public PostalAddressType() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.postalAddressType");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a postalAddressType
     */
    @javax.annotation.Nonnull
    public static PostalAddressType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PostalAddressType();
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
     * Gets the city property value. The city property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this._city;
    }
    /**
     * Gets the countryLetterCode property value. The countryLetterCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryLetterCode() {
        return this._countryLetterCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PostalAddressType currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("city", (n) -> { currentObject.setCity(n.getStringValue()); });
            this.put("countryLetterCode", (n) -> { currentObject.setCountryLetterCode(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("postalCode", (n) -> { currentObject.setPostalCode(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
            this.put("street", (n) -> { currentObject.setStreet(n.getStringValue()); });
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
     * Gets the postalCode property value. The postalCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostalCode() {
        return this._postalCode;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Gets the street property value. The street property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStreet() {
        return this._street;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("countryLetterCode", this.getCountryLetterCode());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("street", this.getStreet());
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
     * Sets the city property value. The city property
     * @param value Value to set for the city property.
     * @return a void
     */
    public void setCity(@javax.annotation.Nullable final String value) {
        this._city = value;
    }
    /**
     * Sets the countryLetterCode property value. The countryLetterCode property
     * @param value Value to set for the countryLetterCode property.
     * @return a void
     */
    public void setCountryLetterCode(@javax.annotation.Nullable final String value) {
        this._countryLetterCode = value;
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
     * Sets the postalCode property value. The postalCode property
     * @param value Value to set for the postalCode property.
     * @return a void
     */
    public void setPostalCode(@javax.annotation.Nullable final String value) {
        this._postalCode = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
    /**
     * Sets the street property value. The street property
     * @param value Value to set for the street property.
     * @return a void
     */
    public void setStreet(@javax.annotation.Nullable final String value) {
        this._street = value;
    }
}
