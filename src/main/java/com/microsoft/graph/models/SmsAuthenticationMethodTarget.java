package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SmsAuthenticationMethodTarget extends AuthenticationMethodTarget implements Parsable {
    /** Determines if the users or groups can use this authentication method to sign in to Azure AD. The value is always true. */
    private Boolean _isUsableForSignIn;
    /**
     * Instantiates a new SmsAuthenticationMethodTarget and sets the default values.
     * @return a void
     */
    public SmsAuthenticationMethodTarget() {
        super();
        this.setOdataType("#microsoft.graph.smsAuthenticationMethodTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SmsAuthenticationMethodTarget
     */
    @javax.annotation.Nonnull
    public static SmsAuthenticationMethodTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SmsAuthenticationMethodTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SmsAuthenticationMethodTarget currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("isUsableForSignIn", (n) -> { currentObject.setIsUsableForSignIn(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isUsableForSignIn property value. Determines if the users or groups can use this authentication method to sign in to Azure AD. The value is always true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsUsableForSignIn() {
        return this._isUsableForSignIn;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isUsableForSignIn", this.getIsUsableForSignIn());
    }
    /**
     * Sets the isUsableForSignIn property value. Determines if the users or groups can use this authentication method to sign in to Azure AD. The value is always true.
     * @param value Value to set for the isUsableForSignIn property.
     * @return a void
     */
    public void setIsUsableForSignIn(@javax.annotation.Nullable final Boolean value) {
        this._isUsableForSignIn = value;
    }
}
