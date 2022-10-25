package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesApplicationSegment implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If you're configuring a traffic manager in front of multiple App Proxy application segments, contains the user-friendly URL that will point to the traffic manager. */
    private String _alternateUrl;
    /** CORS Rule definition for a particular application segment. */
    private java.util.List<CorsConfiguration> _corsConfigurations;
    /** The published external URL for the application segment; for example, https://intranet.contoso.com./ */
    private String _externalUrl;
    /** The internal URL of the application segment; for example, https://intranet/. */
    private String _internalUrl;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new onPremisesApplicationSegment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesApplicationSegment() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.onPremisesApplicationSegment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesApplicationSegment
     */
    @javax.annotation.Nonnull
    public static OnPremisesApplicationSegment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesApplicationSegment();
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
     * Gets the alternateUrl property value. If you're configuring a traffic manager in front of multiple App Proxy application segments, contains the user-friendly URL that will point to the traffic manager.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlternateUrl() {
        return this._alternateUrl;
    }
    /**
     * Gets the corsConfigurations property value. CORS Rule definition for a particular application segment.
     * @return a corsConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<CorsConfiguration> getCorsConfigurations() {
        return this._corsConfigurations;
    }
    /**
     * Gets the externalUrl property value. The published external URL for the application segment; for example, https://intranet.contoso.com./
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalUrl() {
        return this._externalUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesApplicationSegment currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("alternateUrl", (n) -> { currentObject.setAlternateUrl(n.getStringValue()); });
            this.put("corsConfigurations", (n) -> { currentObject.setCorsConfigurations(n.getCollectionOfObjectValues(CorsConfiguration::createFromDiscriminatorValue)); });
            this.put("externalUrl", (n) -> { currentObject.setExternalUrl(n.getStringValue()); });
            this.put("internalUrl", (n) -> { currentObject.setInternalUrl(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the internalUrl property value. The internal URL of the application segment; for example, https://intranet/.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternalUrl() {
        return this._internalUrl;
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
        writer.writeStringValue("alternateUrl", this.getAlternateUrl());
        writer.writeCollectionOfObjectValues("corsConfigurations", this.getCorsConfigurations());
        writer.writeStringValue("externalUrl", this.getExternalUrl());
        writer.writeStringValue("internalUrl", this.getInternalUrl());
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
     * Sets the alternateUrl property value. If you're configuring a traffic manager in front of multiple App Proxy application segments, contains the user-friendly URL that will point to the traffic manager.
     * @param value Value to set for the alternateUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternateUrl(@javax.annotation.Nullable final String value) {
        this._alternateUrl = value;
    }
    /**
     * Sets the corsConfigurations property value. CORS Rule definition for a particular application segment.
     * @param value Value to set for the corsConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorsConfigurations(@javax.annotation.Nullable final java.util.List<CorsConfiguration> value) {
        this._corsConfigurations = value;
    }
    /**
     * Sets the externalUrl property value. The published external URL for the application segment; for example, https://intranet.contoso.com./
     * @param value Value to set for the externalUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalUrl(@javax.annotation.Nullable final String value) {
        this._externalUrl = value;
    }
    /**
     * Sets the internalUrl property value. The internal URL of the application segment; for example, https://intranet/.
     * @param value Value to set for the internalUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternalUrl(@javax.annotation.Nullable final String value) {
        this._internalUrl = value;
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
