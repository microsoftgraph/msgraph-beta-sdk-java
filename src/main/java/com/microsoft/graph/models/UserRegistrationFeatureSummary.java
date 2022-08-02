package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserRegistrationFeatureSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Total number of users accounts, excluding those that are blocked */
    private Long _totalUserCount;
    /** Number of users registered or capable for Multi-Factor Authentication, Self-Service Password Reset and Passwordless Authentication. */
    private java.util.List<UserRegistrationFeatureCount> _userRegistrationFeatureCounts;
    /** User role type. Possible values are: all, privilegedAdmin, admin, user. */
    private IncludedUserRoles _userRoles;
    /** User type. Possible values are: all, member, guest. */
    private IncludedUserTypes _userTypes;
    /**
     * Instantiates a new UserRegistrationFeatureSummary and sets the default values.
     * @return a void
     */
    public UserRegistrationFeatureSummary() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.userRegistrationFeatureSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserRegistrationFeatureSummary
     */
    @javax.annotation.Nonnull
    public static UserRegistrationFeatureSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRegistrationFeatureSummary();
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
        final UserRegistrationFeatureSummary currentObject = this;
        return new HashMap<>(5) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("totalUserCount", (n) -> { currentObject.setTotalUserCount(n.getLongValue()); });
            this.put("userRegistrationFeatureCounts", (n) -> { currentObject.setUserRegistrationFeatureCounts(n.getCollectionOfObjectValues(UserRegistrationFeatureCount::createFromDiscriminatorValue)); });
            this.put("userRoles", (n) -> { currentObject.setUserRoles(n.getEnumValue(IncludedUserRoles.class)); });
            this.put("userTypes", (n) -> { currentObject.setUserTypes(n.getEnumValue(IncludedUserTypes.class)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the totalUserCount property value. Total number of users accounts, excluding those that are blocked
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalUserCount() {
        return this._totalUserCount;
    }
    /**
     * Gets the userRegistrationFeatureCounts property value. Number of users registered or capable for Multi-Factor Authentication, Self-Service Password Reset and Passwordless Authentication.
     * @return a userRegistrationFeatureCount
     */
    @javax.annotation.Nullable
    public java.util.List<UserRegistrationFeatureCount> getUserRegistrationFeatureCounts() {
        return this._userRegistrationFeatureCounts;
    }
    /**
     * Gets the userRoles property value. User role type. Possible values are: all, privilegedAdmin, admin, user.
     * @return a includedUserRoles
     */
    @javax.annotation.Nullable
    public IncludedUserRoles getUserRoles() {
        return this._userRoles;
    }
    /**
     * Gets the userTypes property value. User type. Possible values are: all, member, guest.
     * @return a includedUserTypes
     */
    @javax.annotation.Nullable
    public IncludedUserTypes getUserTypes() {
        return this._userTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("totalUserCount", this.getTotalUserCount());
        writer.writeCollectionOfObjectValues("userRegistrationFeatureCounts", this.getUserRegistrationFeatureCounts());
        writer.writeEnumValue("userRoles", this.getUserRoles());
        writer.writeEnumValue("userTypes", this.getUserTypes());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the totalUserCount property value. Total number of users accounts, excluding those that are blocked
     * @param value Value to set for the totalUserCount property.
     * @return a void
     */
    public void setTotalUserCount(@javax.annotation.Nullable final Long value) {
        this._totalUserCount = value;
    }
    /**
     * Sets the userRegistrationFeatureCounts property value. Number of users registered or capable for Multi-Factor Authentication, Self-Service Password Reset and Passwordless Authentication.
     * @param value Value to set for the userRegistrationFeatureCounts property.
     * @return a void
     */
    public void setUserRegistrationFeatureCounts(@javax.annotation.Nullable final java.util.List<UserRegistrationFeatureCount> value) {
        this._userRegistrationFeatureCounts = value;
    }
    /**
     * Sets the userRoles property value. User role type. Possible values are: all, privilegedAdmin, admin, user.
     * @param value Value to set for the userRoles property.
     * @return a void
     */
    public void setUserRoles(@javax.annotation.Nullable final IncludedUserRoles value) {
        this._userRoles = value;
    }
    /**
     * Sets the userTypes property value. User type. Possible values are: all, member, guest.
     * @param value Value to set for the userTypes property.
     * @return a void
     */
    public void setUserTypes(@javax.annotation.Nullable final IncludedUserTypes value) {
        this._userTypes = value;
    }
}
