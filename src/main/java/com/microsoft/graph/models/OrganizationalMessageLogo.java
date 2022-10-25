package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains the logo's binary content or a url to the logo's downloadable location. Either both logo and contentType contain valid values or logoCdnUrl contains a valid url */
public class OrganizationalMessageLogo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The content type of the logo that is contained in the logo array. This is null when logoCdnUrl is used to send the logo */
    private OrganizationalMessageLogoType _contentType;
    /** The binary contents of the logo. This is null when logoCdnUrl is used to send the logo */
    private byte[] _logo;
    /** The url at which the logo resides. This is null when logo and contentType are used to send the logo */
    private String _logoCdnUrl;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new organizationalMessageLogo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationalMessageLogo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.organizationalMessageLogo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalMessageLogo
     */
    @javax.annotation.Nonnull
    public static OrganizationalMessageLogo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalMessageLogo();
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
     * Gets the contentType property value. The content type of the logo that is contained in the logo array. This is null when logoCdnUrl is used to send the logo
     * @return a organizationalMessageLogoType
     */
    @javax.annotation.Nullable
    public OrganizationalMessageLogoType getContentType() {
        return this._contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationalMessageLogo currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("contentType", (n) -> { currentObject.setContentType(n.getEnumValue(OrganizationalMessageLogoType.class)); });
            this.put("logo", (n) -> { currentObject.setLogo(n.getByteArrayValue()); });
            this.put("logoCdnUrl", (n) -> { currentObject.setLogoCdnUrl(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the logo property value. The binary contents of the logo. This is null when logoCdnUrl is used to send the logo
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getLogo() {
        return this._logo;
    }
    /**
     * Gets the logoCdnUrl property value. The url at which the logo resides. This is null when logo and contentType are used to send the logo
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogoCdnUrl() {
        return this._logoCdnUrl;
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
        writer.writeEnumValue("contentType", this.getContentType());
        writer.writeByteArrayValue("logo", this.getLogo());
        writer.writeStringValue("logoCdnUrl", this.getLogoCdnUrl());
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
     * Sets the contentType property value. The content type of the logo that is contained in the logo array. This is null when logoCdnUrl is used to send the logo
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final OrganizationalMessageLogoType value) {
        this._contentType = value;
    }
    /**
     * Sets the logo property value. The binary contents of the logo. This is null when logoCdnUrl is used to send the logo
     * @param value Value to set for the logo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogo(@javax.annotation.Nullable final byte[] value) {
        this._logo = value;
    }
    /**
     * Sets the logoCdnUrl property value. The url at which the logo resides. This is null when logo and contentType are used to send the logo
     * @param value Value to set for the logoCdnUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogoCdnUrl(@javax.annotation.Nullable final String value) {
        this._logoCdnUrl = value;
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
