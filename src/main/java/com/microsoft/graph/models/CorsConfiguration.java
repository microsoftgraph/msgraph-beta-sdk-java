package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CorsConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The request headers that the origin domain may specify on the CORS request. The wildcard character * indicates that any header beginning with the specified prefix is allowed. */
    private java.util.List<String> _allowedHeaders;
    /** The HTTP request methods that the origin domain may use for a CORS request. */
    private java.util.List<String> _allowedMethods;
    /** The origin domains that are permitted to make a request against the service via CORS. The origin domain is the domain from which the request originates. The origin must be an exact case-sensitive match with the origin that the user age sends to the service. */
    private java.util.List<String> _allowedOrigins;
    /** The maximum amount of time that a browser should cache the response to the preflight OPTIONS request. */
    private Integer _maxAgeInSeconds;
    /** The OdataType property */
    private String _odataType;
    /** Resource within the application segment for which CORS permissions are granted. / grants permission for whole app segment. */
    private String _resource;
    /**
     * Instantiates a new corsConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CorsConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.corsConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a corsConfiguration
     */
    @javax.annotation.Nonnull
    public static CorsConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CorsConfiguration();
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
     * Gets the allowedHeaders property value. The request headers that the origin domain may specify on the CORS request. The wildcard character * indicates that any header beginning with the specified prefix is allowed.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedHeaders() {
        return this._allowedHeaders;
    }
    /**
     * Gets the allowedMethods property value. The HTTP request methods that the origin domain may use for a CORS request.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedMethods() {
        return this._allowedMethods;
    }
    /**
     * Gets the allowedOrigins property value. The origin domains that are permitted to make a request against the service via CORS. The origin domain is the domain from which the request originates. The origin must be an exact case-sensitive match with the origin that the user age sends to the service.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedOrigins() {
        return this._allowedOrigins;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CorsConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("allowedHeaders", (n) -> { currentObject.setAllowedHeaders(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("allowedMethods", (n) -> { currentObject.setAllowedMethods(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("allowedOrigins", (n) -> { currentObject.setAllowedOrigins(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("maxAgeInSeconds", (n) -> { currentObject.setMaxAgeInSeconds(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("resource", (n) -> { currentObject.setResource(n.getStringValue()); });
        }};
    }
    /**
     * Gets the maxAgeInSeconds property value. The maximum amount of time that a browser should cache the response to the preflight OPTIONS request.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxAgeInSeconds() {
        return this._maxAgeInSeconds;
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
     * Gets the resource property value. Resource within the application segment for which CORS permissions are granted. / grants permission for whole app segment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResource() {
        return this._resource;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedHeaders", this.getAllowedHeaders());
        writer.writeCollectionOfPrimitiveValues("allowedMethods", this.getAllowedMethods());
        writer.writeCollectionOfPrimitiveValues("allowedOrigins", this.getAllowedOrigins());
        writer.writeIntegerValue("maxAgeInSeconds", this.getMaxAgeInSeconds());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resource", this.getResource());
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
     * Sets the allowedHeaders property value. The request headers that the origin domain may specify on the CORS request. The wildcard character * indicates that any header beginning with the specified prefix is allowed.
     * @param value Value to set for the allowedHeaders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedHeaders(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedHeaders = value;
    }
    /**
     * Sets the allowedMethods property value. The HTTP request methods that the origin domain may use for a CORS request.
     * @param value Value to set for the allowedMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedMethods(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedMethods = value;
    }
    /**
     * Sets the allowedOrigins property value. The origin domains that are permitted to make a request against the service via CORS. The origin domain is the domain from which the request originates. The origin must be an exact case-sensitive match with the origin that the user age sends to the service.
     * @param value Value to set for the allowedOrigins property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedOrigins(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedOrigins = value;
    }
    /**
     * Sets the maxAgeInSeconds property value. The maximum amount of time that a browser should cache the response to the preflight OPTIONS request.
     * @param value Value to set for the maxAgeInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxAgeInSeconds(@javax.annotation.Nullable final Integer value) {
        this._maxAgeInSeconds = value;
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
     * Sets the resource property value. Resource within the application segment for which CORS permissions are granted. / grants permission for whole app segment.
     * @param value Value to set for the resource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResource(@javax.annotation.Nullable final String value) {
        this._resource = value;
    }
}
