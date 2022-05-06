package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PasswordCredentialConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The maxLifetime property  */
    private Period _maxLifetime;
    /** Enforces the policy for an app created on or after the enforcement date. For existing applications, the enforcement date would be backdated. To apply to all applications, this date would be null.  */
    private OffsetDateTime _restrictForAppsCreatedAfterDateTime;
    /** The type of restriction being applied. The possible values are: passwordAddition, passwordLifetime, symmetricKeyAddition, symmetricKeyLifetime,customPasswordAddition, unknownFutureValue. Each value of restrictionType can be used only once per policy.  */
    private AppCredentialRestrictionType _restrictionType;
    /**
     * Instantiates a new passwordCredentialConfiguration and sets the default values.
     * @return a void
     */
    public PasswordCredentialConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a passwordCredentialConfiguration
     */
    @javax.annotation.Nonnull
    public static PasswordCredentialConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasswordCredentialConfiguration();
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
        final PasswordCredentialConfiguration currentObject = this;
        return new HashMap<>(3) {{
            this.put("maxLifetime", (n) -> { currentObject.setMaxLifetime(n.getPeriodValue()); });
            this.put("restrictForAppsCreatedAfterDateTime", (n) -> { currentObject.setRestrictForAppsCreatedAfterDateTime(n.getOffsetDateTimeValue()); });
            this.put("restrictionType", (n) -> { currentObject.setRestrictionType(n.getEnumValue(AppCredentialRestrictionType.class)); });
        }};
    }
    /**
     * Gets the maxLifetime property value. The maxLifetime property
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaxLifetime() {
        return this._maxLifetime;
    }
    /**
     * Gets the restrictForAppsCreatedAfterDateTime property value. Enforces the policy for an app created on or after the enforcement date. For existing applications, the enforcement date would be backdated. To apply to all applications, this date would be null.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRestrictForAppsCreatedAfterDateTime() {
        return this._restrictForAppsCreatedAfterDateTime;
    }
    /**
     * Gets the restrictionType property value. The type of restriction being applied. The possible values are: passwordAddition, passwordLifetime, symmetricKeyAddition, symmetricKeyLifetime,customPasswordAddition, unknownFutureValue. Each value of restrictionType can be used only once per policy.
     * @return a appCredentialRestrictionType
     */
    @javax.annotation.Nullable
    public AppCredentialRestrictionType getRestrictionType() {
        return this._restrictionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writePeriodValue("maxLifetime", this.getMaxLifetime());
        writer.writeOffsetDateTimeValue("restrictForAppsCreatedAfterDateTime", this.getRestrictForAppsCreatedAfterDateTime());
        writer.writeEnumValue("restrictionType", this.getRestrictionType());
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
     * Sets the maxLifetime property value. The maxLifetime property
     * @param value Value to set for the maxLifetime property.
     * @return a void
     */
    public void setMaxLifetime(@javax.annotation.Nullable final Period value) {
        this._maxLifetime = value;
    }
    /**
     * Sets the restrictForAppsCreatedAfterDateTime property value. Enforces the policy for an app created on or after the enforcement date. For existing applications, the enforcement date would be backdated. To apply to all applications, this date would be null.
     * @param value Value to set for the restrictForAppsCreatedAfterDateTime property.
     * @return a void
     */
    public void setRestrictForAppsCreatedAfterDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._restrictForAppsCreatedAfterDateTime = value;
    }
    /**
     * Sets the restrictionType property value. The type of restriction being applied. The possible values are: passwordAddition, passwordLifetime, symmetricKeyAddition, symmetricKeyLifetime,customPasswordAddition, unknownFutureValue. Each value of restrictionType can be used only once per policy.
     * @param value Value to set for the restrictionType property.
     * @return a void
     */
    public void setRestrictionType(@javax.annotation.Nullable final AppCredentialRestrictionType value) {
        this._restrictionType = value;
    }
}
