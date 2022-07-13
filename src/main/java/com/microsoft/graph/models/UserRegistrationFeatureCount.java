package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserRegistrationFeatureCount implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The feature property */
    private AuthenticationMethodFeature _feature;
    /** Number of users. */
    private Long _userCount;
    /**
     * Instantiates a new userRegistrationFeatureCount and sets the default values.
     * @return a void
     */
    public UserRegistrationFeatureCount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userRegistrationFeatureCount
     */
    @javax.annotation.Nonnull
    public static UserRegistrationFeatureCount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRegistrationFeatureCount();
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
     * Gets the feature property value. The feature property
     * @return a authenticationMethodFeature
     */
    @javax.annotation.Nullable
    public AuthenticationMethodFeature getFeature() {
        return this._feature;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserRegistrationFeatureCount currentObject = this;
        return new HashMap<>(2) {{
            this.put("feature", (n) -> { currentObject.setFeature(n.getEnumValue(AuthenticationMethodFeature.class)); });
            this.put("userCount", (n) -> { currentObject.setUserCount(n.getLongValue()); });
        }};
    }
    /**
     * Gets the userCount property value. Number of users.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUserCount() {
        return this._userCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("feature", this.getFeature());
        writer.writeLongValue("userCount", this.getUserCount());
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
     * Sets the feature property value. The feature property
     * @param value Value to set for the feature property.
     * @return a void
     */
    public void setFeature(@javax.annotation.Nullable final AuthenticationMethodFeature value) {
        this._feature = value;
    }
    /**
     * Sets the userCount property value. Number of users.
     * @param value Value to set for the userCount property.
     * @return a void
     */
    public void setUserCount(@javax.annotation.Nullable final Long value) {
        this._userCount = value;
    }
}
