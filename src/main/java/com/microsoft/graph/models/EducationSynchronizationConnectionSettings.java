package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSynchronizationConnectionSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Client ID used to connect to the provider. */
    private String _clientId;
    /** Client secret to authenticate the connection to the provider. */
    private String _clientSecret;
    /** The type property */
    private String _type;
    /**
     * Instantiates a new educationSynchronizationConnectionSettings and sets the default values.
     * @return a void
     */
    public EducationSynchronizationConnectionSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdatatype("#microsoft.graph.educationSynchronizationConnectionSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationSynchronizationConnectionSettings
     */
    @javax.annotation.Nonnull
    public static EducationSynchronizationConnectionSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.educationSynchronizationOAuth1ConnectionSettings": return new EducationSynchronizationOAuth1ConnectionSettings();
                case "#microsoft.graph.educationSynchronizationOAuth2ClientCredentialsConnectionSettings": return new EducationSynchronizationOAuth2ClientCredentialsConnectionSettings();
            }
        }
        return new EducationSynchronizationConnectionSettings();
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
     * Gets the clientId property value. Client ID used to connect to the provider.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientId() {
        return this._clientId;
    }
    /**
     * Gets the clientSecret property value. Client secret to authenticate the connection to the provider.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientSecret() {
        return this._clientSecret;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationSynchronizationConnectionSettings currentObject = this;
        return new HashMap<>(3) {{
            this.put("clientId", (n) -> { currentObject.setClientId(n.getStringValue()); });
            this.put("clientSecret", (n) -> { currentObject.setClientSecret(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdatatype(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdatatype() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("clientSecret", this.getClientSecret());
        writer.writeStringValue("@odata.type", this.getOdatatype());
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
     * Sets the clientId property value. Client ID used to connect to the provider.
     * @param value Value to set for the clientId property.
     * @return a void
     */
    public void setClientId(@javax.annotation.Nullable final String value) {
        this._clientId = value;
    }
    /**
     * Sets the clientSecret property value. Client secret to authenticate the connection to the provider.
     * @param value Value to set for the clientSecret property.
     * @return a void
     */
    public void setClientSecret(@javax.annotation.Nullable final String value) {
        this._clientSecret = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setOdatatype(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
