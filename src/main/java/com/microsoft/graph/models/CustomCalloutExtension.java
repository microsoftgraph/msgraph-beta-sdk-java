package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomCalloutExtension extends Entity implements Parsable {
    /** Configuration for securing the API call to the logic app. For example, using OAuth client credentials flow.  */
    private CustomExtensionAuthenticationConfiguration _authenticationConfiguration;
    /** HTTP connection settings that define how long Azure AD can wait for a connection to a logic app, how many times you can retry a timed-out connection and the exception scenarios when retries are allowed.  */
    private CustomExtensionClientConfiguration _clientConfiguration;
    /** Description for the customCalloutExtension object.  */
    private String _description;
    /** Display name for the customCalloutExtension object.  */
    private String _displayName;
    /** The type and details for configuring the endpoint to call the logic app's workflow.  */
    private CustomExtensionEndpointConfiguration _endpointConfiguration;
    /**
     * Instantiates a new customCalloutExtension and sets the default values.
     * @return a void
     */
    public CustomCalloutExtension() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customCalloutExtension
     */
    @javax.annotation.Nonnull
    public static CustomCalloutExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomCalloutExtension();
    }
    /**
     * Gets the authenticationConfiguration property value. Configuration for securing the API call to the logic app. For example, using OAuth client credentials flow.
     * @return a customExtensionAuthenticationConfiguration
     */
    @javax.annotation.Nullable
    public CustomExtensionAuthenticationConfiguration getAuthenticationConfiguration() {
        return this._authenticationConfiguration;
    }
    /**
     * Gets the clientConfiguration property value. HTTP connection settings that define how long Azure AD can wait for a connection to a logic app, how many times you can retry a timed-out connection and the exception scenarios when retries are allowed.
     * @return a customExtensionClientConfiguration
     */
    @javax.annotation.Nullable
    public CustomExtensionClientConfiguration getClientConfiguration() {
        return this._clientConfiguration;
    }
    /**
     * Gets the description property value. Description for the customCalloutExtension object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Display name for the customCalloutExtension object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the endpointConfiguration property value. The type and details for configuring the endpoint to call the logic app's workflow.
     * @return a customExtensionEndpointConfiguration
     */
    @javax.annotation.Nullable
    public CustomExtensionEndpointConfiguration getEndpointConfiguration() {
        return this._endpointConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CustomCalloutExtension currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationConfiguration", (n) -> { currentObject.setAuthenticationConfiguration(n.getObjectValue(CustomExtensionAuthenticationConfiguration::createFromDiscriminatorValue)); });
            this.put("clientConfiguration", (n) -> { currentObject.setClientConfiguration(n.getObjectValue(CustomExtensionClientConfiguration::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("endpointConfiguration", (n) -> { currentObject.setEndpointConfiguration(n.getObjectValue(CustomExtensionEndpointConfiguration::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("authenticationConfiguration", this.getAuthenticationConfiguration());
        writer.writeObjectValue("clientConfiguration", this.getClientConfiguration());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("endpointConfiguration", this.getEndpointConfiguration());
    }
    /**
     * Sets the authenticationConfiguration property value. Configuration for securing the API call to the logic app. For example, using OAuth client credentials flow.
     * @param value Value to set for the authenticationConfiguration property.
     * @return a void
     */
    public void setAuthenticationConfiguration(@javax.annotation.Nullable final CustomExtensionAuthenticationConfiguration value) {
        this._authenticationConfiguration = value;
    }
    /**
     * Sets the clientConfiguration property value. HTTP connection settings that define how long Azure AD can wait for a connection to a logic app, how many times you can retry a timed-out connection and the exception scenarios when retries are allowed.
     * @param value Value to set for the clientConfiguration property.
     * @return a void
     */
    public void setClientConfiguration(@javax.annotation.Nullable final CustomExtensionClientConfiguration value) {
        this._clientConfiguration = value;
    }
    /**
     * Sets the description property value. Description for the customCalloutExtension object.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Display name for the customCalloutExtension object.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the endpointConfiguration property value. The type and details for configuring the endpoint to call the logic app's workflow.
     * @param value Value to set for the endpointConfiguration property.
     * @return a void
     */
    public void setEndpointConfiguration(@javax.annotation.Nullable final CustomExtensionEndpointConfiguration value) {
        this._endpointConfiguration = value;
    }
}
