package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PasswordSingleSignOnCredentialSet implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A list of credential objects that define the complete sign in flow. */
    private java.util.List<Credential> _credentials;
    /** The ID of the user or group this credential set belongs to. */
    private String _id;
    /**
     * Instantiates a new passwordSingleSignOnCredentialSet and sets the default values.
     * @return a void
     */
    public PasswordSingleSignOnCredentialSet() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a passwordSingleSignOnCredentialSet
     */
    @javax.annotation.Nonnull
    public static PasswordSingleSignOnCredentialSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasswordSingleSignOnCredentialSet();
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
     * Gets the credentials property value. A list of credential objects that define the complete sign in flow.
     * @return a credential
     */
    @javax.annotation.Nullable
    public java.util.List<Credential> getCredentials() {
        return this._credentials;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PasswordSingleSignOnCredentialSet currentObject = this;
        return new HashMap<>(2) {{
            this.put("credentials", (n) -> { currentObject.setCredentials(n.getCollectionOfObjectValues(Credential::createFromDiscriminatorValue)); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. The ID of the user or group this credential set belongs to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("credentials", this.getCredentials());
        writer.writeStringValue("id", this.getId());
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
     * Sets the credentials property value. A list of credential objects that define the complete sign in flow.
     * @param value Value to set for the credentials property.
     * @return a void
     */
    public void setCredentials(@javax.annotation.Nullable final java.util.List<Credential> value) {
        this._credentials = value;
    }
    /**
     * Sets the id property value. The ID of the user or group this credential set belongs to.
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
}
