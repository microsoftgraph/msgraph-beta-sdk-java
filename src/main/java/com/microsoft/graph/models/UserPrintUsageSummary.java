package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserPrintUsageSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The completedJobCount property */
    private Integer _completedJobCount;
    /** The incompleteJobCount property */
    private Integer _incompleteJobCount;
    /** The OdataType property */
    private String _odataType;
    /** The user property */
    private Identity _user;
    /** The userDisplayName property */
    private String _userDisplayName;
    /** The userPrincipalName property */
    private String _userPrincipalName;
    /**
     * Instantiates a new userPrintUsageSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserPrintUsageSummary() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.userPrintUsageSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userPrintUsageSummary
     */
    @javax.annotation.Nonnull
    public static UserPrintUsageSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserPrintUsageSummary();
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
     * Gets the completedJobCount property value. The completedJobCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompletedJobCount() {
        return this._completedJobCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserPrintUsageSummary currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("completedJobCount", (n) -> { currentObject.setCompletedJobCount(n.getIntegerValue()); });
            this.put("incompleteJobCount", (n) -> { currentObject.setIncompleteJobCount(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("user", (n) -> { currentObject.setUser(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the incompleteJobCount property value. The incompleteJobCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIncompleteJobCount() {
        return this._incompleteJobCount;
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
     * Gets the user property value. The user property
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getUser() {
        return this._user;
    }
    /**
     * Gets the userDisplayName property value. The userDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("completedJobCount", this.getCompletedJobCount());
        writer.writeIntegerValue("incompleteJobCount", this.getIncompleteJobCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("user", this.getUser());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the completedJobCount property value. The completedJobCount property
     * @param value Value to set for the completedJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedJobCount(@javax.annotation.Nullable final Integer value) {
        this._completedJobCount = value;
    }
    /**
     * Sets the incompleteJobCount property value. The incompleteJobCount property
     * @param value Value to set for the incompleteJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncompleteJobCount(@javax.annotation.Nullable final Integer value) {
        this._incompleteJobCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUser(@javax.annotation.Nullable final Identity value) {
        this._user = value;
    }
    /**
     * Sets the userDisplayName property value. The userDisplayName property
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
