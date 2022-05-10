package microsoft.graph.models;

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
    /** The allowedHeaders property */
    private java.util.List<String> _allowedHeaders;
    /** The allowedMethods property */
    private java.util.List<String> _allowedMethods;
    /** The allowedOrigins property */
    private java.util.List<String> _allowedOrigins;
    /** The maxAgeInSeconds property */
    private Integer _maxAgeInSeconds;
    /** The resource property */
    private String _resource;
    /**
     * Instantiates a new corsConfiguration and sets the default values.
     * @return a void
     */
    public CorsConfiguration() {
        this.setAdditionalData(new HashMap<>());
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
     * Gets the allowedHeaders property value. The allowedHeaders property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedHeaders() {
        return this._allowedHeaders;
    }
    /**
     * Gets the allowedMethods property value. The allowedMethods property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedMethods() {
        return this._allowedMethods;
    }
    /**
     * Gets the allowedOrigins property value. The allowedOrigins property
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
        return new HashMap<>(5) {{
            this.put("allowedHeaders", (n) -> { currentObject.setAllowedHeaders(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("allowedMethods", (n) -> { currentObject.setAllowedMethods(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("allowedOrigins", (n) -> { currentObject.setAllowedOrigins(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("maxAgeInSeconds", (n) -> { currentObject.setMaxAgeInSeconds(n.getIntegerValue()); });
            this.put("resource", (n) -> { currentObject.setResource(n.getStringValue()); });
        }};
    }
    /**
     * Gets the maxAgeInSeconds property value. The maxAgeInSeconds property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxAgeInSeconds() {
        return this._maxAgeInSeconds;
    }
    /**
     * Gets the resource property value. The resource property
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedHeaders", this.getAllowedHeaders());
        writer.writeCollectionOfPrimitiveValues("allowedMethods", this.getAllowedMethods());
        writer.writeCollectionOfPrimitiveValues("allowedOrigins", this.getAllowedOrigins());
        writer.writeIntegerValue("maxAgeInSeconds", this.getMaxAgeInSeconds());
        writer.writeStringValue("resource", this.getResource());
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
     * Sets the allowedHeaders property value. The allowedHeaders property
     * @param value Value to set for the allowedHeaders property.
     * @return a void
     */
    public void setAllowedHeaders(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedHeaders = value;
    }
    /**
     * Sets the allowedMethods property value. The allowedMethods property
     * @param value Value to set for the allowedMethods property.
     * @return a void
     */
    public void setAllowedMethods(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedMethods = value;
    }
    /**
     * Sets the allowedOrigins property value. The allowedOrigins property
     * @param value Value to set for the allowedOrigins property.
     * @return a void
     */
    public void setAllowedOrigins(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedOrigins = value;
    }
    /**
     * Sets the maxAgeInSeconds property value. The maxAgeInSeconds property
     * @param value Value to set for the maxAgeInSeconds property.
     * @return a void
     */
    public void setMaxAgeInSeconds(@javax.annotation.Nullable final Integer value) {
        this._maxAgeInSeconds = value;
    }
    /**
     * Sets the resource property value. The resource property
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final String value) {
        this._resource = value;
    }
}
