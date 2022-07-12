package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserAccount implements AdditionalDataHolder, Parsable {
    /** The accountName property */
    private String _accountName;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The azureAdUserId property */
    private String _azureAdUserId;
    /** The domainName property */
    private String _domainName;
    /** The userPrincipalName property */
    private String _userPrincipalName;
    /** The userSid property */
    private String _userSid;
    /**
     * Instantiates a new userAccount and sets the default values.
     * @return a void
     */
    public UserAccount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userAccount
     */
    @javax.annotation.Nonnull
    public static UserAccount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAccount();
    }
    /**
     * Gets the accountName property value. The accountName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountName() {
        return this._accountName;
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
     * Gets the azureAdUserId property value. The azureAdUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureAdUserId() {
        return this._azureAdUserId;
    }
    /**
     * Gets the domainName property value. The domainName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainName() {
        return this._domainName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserAccount currentObject = this;
        return new HashMap<>(5) {{
            this.put("accountName", (n) -> { currentObject.setAccountName(n.getStringValue()); });
            this.put("azureAdUserId", (n) -> { currentObject.setAzureAdUserId(n.getStringValue()); });
            this.put("domainName", (n) -> { currentObject.setDomainName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
            this.put("userSid", (n) -> { currentObject.setUserSid(n.getStringValue()); });
        }};
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the userSid property value. The userSid property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserSid() {
        return this._userSid;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeStringValue("azureAdUserId", this.getAzureAdUserId());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeStringValue("userSid", this.getUserSid());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountName property value. The accountName property
     * @param value Value to set for the accountName property.
     * @return a void
     */
    public void setAccountName(@javax.annotation.Nullable final String value) {
        this._accountName = value;
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
     * Sets the azureAdUserId property value. The azureAdUserId property
     * @param value Value to set for the azureAdUserId property.
     * @return a void
     */
    public void setAzureAdUserId(@javax.annotation.Nullable final String value) {
        this._azureAdUserId = value;
    }
    /**
     * Sets the domainName property value. The domainName property
     * @param value Value to set for the domainName property.
     * @return a void
     */
    public void setDomainName(@javax.annotation.Nullable final String value) {
        this._domainName = value;
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the userSid property value. The userSid property
     * @param value Value to set for the userSid property.
     * @return a void
     */
    public void setUserSid(@javax.annotation.Nullable final String value) {
        this._userSid = value;
    }
}
