package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WebApplicationSegment extends ApplicationSegment implements Parsable {
    /** The alternateUrl property */
    private String _alternateUrl;
    /** The corsConfigurations property */
    private java.util.List<CorsConfiguration_v2> _corsConfigurations;
    /** The externalUrl property */
    private String _externalUrl;
    /** The internalUrl property */
    private String _internalUrl;
    /**
     * Instantiates a new WebApplicationSegment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WebApplicationSegment() {
        super();
        this.setOdataType("#microsoft.graph.webApplicationSegment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WebApplicationSegment
     */
    @javax.annotation.Nonnull
    public static WebApplicationSegment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebApplicationSegment();
    }
    /**
     * Gets the alternateUrl property value. The alternateUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlternateUrl() {
        return this._alternateUrl;
    }
    /**
     * Gets the corsConfigurations property value. The corsConfigurations property
     * @return a corsConfiguration_v2
     */
    @javax.annotation.Nullable
    public java.util.List<CorsConfiguration_v2> getCorsConfigurations() {
        return this._corsConfigurations;
    }
    /**
     * Gets the externalUrl property value. The externalUrl property
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alternateUrl", (n) -> { this.setAlternateUrl(n.getStringValue()); });
        deserializerMap.put("corsConfigurations", (n) -> { this.setCorsConfigurations(n.getCollectionOfObjectValues(CorsConfiguration_v2::createFromDiscriminatorValue)); });
        deserializerMap.put("externalUrl", (n) -> { this.setExternalUrl(n.getStringValue()); });
        deserializerMap.put("internalUrl", (n) -> { this.setInternalUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internalUrl property value. The internalUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternalUrl() {
        return this._internalUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("alternateUrl", this.getAlternateUrl());
        writer.writeCollectionOfObjectValues("corsConfigurations", this.getCorsConfigurations());
        writer.writeStringValue("externalUrl", this.getExternalUrl());
        writer.writeStringValue("internalUrl", this.getInternalUrl());
    }
    /**
     * Sets the alternateUrl property value. The alternateUrl property
     * @param value Value to set for the alternateUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternateUrl(@javax.annotation.Nullable final String value) {
        this._alternateUrl = value;
    }
    /**
     * Sets the corsConfigurations property value. The corsConfigurations property
     * @param value Value to set for the corsConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorsConfigurations(@javax.annotation.Nullable final java.util.List<CorsConfiguration_v2> value) {
        this._corsConfigurations = value;
    }
    /**
     * Sets the externalUrl property value. The externalUrl property
     * @param value Value to set for the externalUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalUrl(@javax.annotation.Nullable final String value) {
        this._externalUrl = value;
    }
    /**
     * Sets the internalUrl property value. The internalUrl property
     * @param value Value to set for the internalUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternalUrl(@javax.annotation.Nullable final String value) {
        this._internalUrl = value;
    }
}
