package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserEvidence extends AlertEvidence implements Parsable {
    /** The userAccount property */
    private UserAccount _userAccount;
    /**
     * Instantiates a new UserEvidence and sets the default values.
     * @return a void
     */
    public UserEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.userEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserEvidence
     */
    @javax.annotation.Nonnull
    public static UserEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserEvidence currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("userAccount", (n) -> { currentObject.setUserAccount(n.getObjectValue(UserAccount::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the userAccount property value. The userAccount property
     * @return a userAccount
     */
    @javax.annotation.Nullable
    public UserAccount getUserAccount() {
        return this._userAccount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("userAccount", this.getUserAccount());
    }
    /**
     * Sets the userAccount property value. The userAccount property
     * @param value Value to set for the userAccount property.
     * @return a void
     */
    public void setUserAccount(@javax.annotation.Nullable final UserAccount value) {
        this._userAccount = value;
    }
}
