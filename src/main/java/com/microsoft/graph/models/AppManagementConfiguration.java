package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppManagementConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Collection of keyCredential restrictions settings to be applied to an application or service principal.  */
    private java.util.List<KeyCredentialConfiguration> _keyCredentials;
    /** Collection of password restrictions settings to be applied to an application or service principal.  */
    private java.util.List<PasswordCredentialConfiguration> _passwordCredentials;
    /**
     * Instantiates a new appManagementConfiguration and sets the default values.
     * @return a void
     */
    public AppManagementConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appManagementConfiguration
     */
    @javax.annotation.Nonnull
    public static AppManagementConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppManagementConfiguration();
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
        final AppManagementConfiguration currentObject = this;
        return new HashMap<>(2) {{
            this.put("keyCredentials", (n) -> { currentObject.setKeyCredentials(n.getCollectionOfObjectValues(KeyCredentialConfiguration::createFromDiscriminatorValue)); });
            this.put("passwordCredentials", (n) -> { currentObject.setPasswordCredentials(n.getCollectionOfObjectValues(PasswordCredentialConfiguration::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the keyCredentials property value. Collection of keyCredential restrictions settings to be applied to an application or service principal.
     * @return a keyCredentialConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<KeyCredentialConfiguration> getKeyCredentials() {
        return this._keyCredentials;
    }
    /**
     * Gets the passwordCredentials property value. Collection of password restrictions settings to be applied to an application or service principal.
     * @return a passwordCredentialConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<PasswordCredentialConfiguration> getPasswordCredentials() {
        return this._passwordCredentials;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("keyCredentials", this.getKeyCredentials());
        writer.writeCollectionOfObjectValues("passwordCredentials", this.getPasswordCredentials());
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
     * Sets the keyCredentials property value. Collection of keyCredential restrictions settings to be applied to an application or service principal.
     * @param value Value to set for the keyCredentials property.
     * @return a void
     */
    public void setKeyCredentials(@javax.annotation.Nullable final java.util.List<KeyCredentialConfiguration> value) {
        this._keyCredentials = value;
    }
    /**
     * Sets the passwordCredentials property value. Collection of password restrictions settings to be applied to an application or service principal.
     * @param value Value to set for the passwordCredentials property.
     * @return a void
     */
    public void setPasswordCredentials(@javax.annotation.Nullable final java.util.List<PasswordCredentialConfiguration> value) {
        this._passwordCredentials = value;
    }
}
