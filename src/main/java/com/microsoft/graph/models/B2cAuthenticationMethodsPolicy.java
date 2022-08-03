package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class B2cAuthenticationMethodsPolicy extends Entity implements Parsable {
    /** The tenant admin can configure local accounts using email if the email and password authentication method is enabled. */
    private Boolean _isEmailPasswordAuthenticationEnabled;
    /** The tenant admin can configure local accounts using phone number if the phone number and one-time password authentication method is enabled. */
    private Boolean _isPhoneOneTimePasswordAuthenticationEnabled;
    /** The tenant admin can configure local accounts using username if the username and password authentication method is enabled. */
    private Boolean _isUserNameAuthenticationEnabled;
    /**
     * Instantiates a new B2cAuthenticationMethodsPolicy and sets the default values.
     * @return a void
     */
    public B2cAuthenticationMethodsPolicy() {
        super();
        this.setOdataType("#microsoft.graph.b2cAuthenticationMethodsPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a B2cAuthenticationMethodsPolicy
     */
    @javax.annotation.Nonnull
    public static B2cAuthenticationMethodsPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new B2cAuthenticationMethodsPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final B2cAuthenticationMethodsPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("isEmailPasswordAuthenticationEnabled", (n) -> { currentObject.setIsEmailPasswordAuthenticationEnabled(n.getBooleanValue()); });
            this.put("isPhoneOneTimePasswordAuthenticationEnabled", (n) -> { currentObject.setIsPhoneOneTimePasswordAuthenticationEnabled(n.getBooleanValue()); });
            this.put("isUserNameAuthenticationEnabled", (n) -> { currentObject.setIsUserNameAuthenticationEnabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isEmailPasswordAuthenticationEnabled property value. The tenant admin can configure local accounts using email if the email and password authentication method is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEmailPasswordAuthenticationEnabled() {
        return this._isEmailPasswordAuthenticationEnabled;
    }
    /**
     * Gets the isPhoneOneTimePasswordAuthenticationEnabled property value. The tenant admin can configure local accounts using phone number if the phone number and one-time password authentication method is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPhoneOneTimePasswordAuthenticationEnabled() {
        return this._isPhoneOneTimePasswordAuthenticationEnabled;
    }
    /**
     * Gets the isUserNameAuthenticationEnabled property value. The tenant admin can configure local accounts using username if the username and password authentication method is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsUserNameAuthenticationEnabled() {
        return this._isUserNameAuthenticationEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isEmailPasswordAuthenticationEnabled", this.getIsEmailPasswordAuthenticationEnabled());
        writer.writeBooleanValue("isPhoneOneTimePasswordAuthenticationEnabled", this.getIsPhoneOneTimePasswordAuthenticationEnabled());
        writer.writeBooleanValue("isUserNameAuthenticationEnabled", this.getIsUserNameAuthenticationEnabled());
    }
    /**
     * Sets the isEmailPasswordAuthenticationEnabled property value. The tenant admin can configure local accounts using email if the email and password authentication method is enabled.
     * @param value Value to set for the isEmailPasswordAuthenticationEnabled property.
     * @return a void
     */
    public void setIsEmailPasswordAuthenticationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEmailPasswordAuthenticationEnabled = value;
    }
    /**
     * Sets the isPhoneOneTimePasswordAuthenticationEnabled property value. The tenant admin can configure local accounts using phone number if the phone number and one-time password authentication method is enabled.
     * @param value Value to set for the isPhoneOneTimePasswordAuthenticationEnabled property.
     * @return a void
     */
    public void setIsPhoneOneTimePasswordAuthenticationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isPhoneOneTimePasswordAuthenticationEnabled = value;
    }
    /**
     * Sets the isUserNameAuthenticationEnabled property value. The tenant admin can configure local accounts using username if the username and password authentication method is enabled.
     * @param value Value to set for the isUserNameAuthenticationEnabled property.
     * @return a void
     */
    public void setIsUserNameAuthenticationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isUserNameAuthenticationEnabled = value;
    }
}
