package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The failedTasks property */
    private Integer _failedTasks;
    /** The failedUsers property */
    private Integer _failedUsers;
    /** The OdataType property */
    private String _odataType;
    /** The successfulUsers property */
    private Integer _successfulUsers;
    /** The totalTasks property */
    private Integer _totalTasks;
    /** The totalUsers property */
    private Integer _totalUsers;
    /**
     * Instantiates a new userSummary and sets the default values.
     * @return a void
     */
    public UserSummary() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.identityGovernance.userSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSummary
     */
    @javax.annotation.Nonnull
    public static UserSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSummary();
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
     * Gets the failedTasks property value. The failedTasks property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedTasks() {
        return this._failedTasks;
    }
    /**
     * Gets the failedUsers property value. The failedUsers property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedUsers() {
        return this._failedUsers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserSummary currentObject = this;
        return new HashMap<>(6) {{
            this.put("failedTasks", (n) -> { currentObject.setFailedTasks(n.getIntegerValue()); });
            this.put("failedUsers", (n) -> { currentObject.setFailedUsers(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("successfulUsers", (n) -> { currentObject.setSuccessfulUsers(n.getIntegerValue()); });
            this.put("totalTasks", (n) -> { currentObject.setTotalTasks(n.getIntegerValue()); });
            this.put("totalUsers", (n) -> { currentObject.setTotalUsers(n.getIntegerValue()); });
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
     * Gets the successfulUsers property value. The successfulUsers property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessfulUsers() {
        return this._successfulUsers;
    }
    /**
     * Gets the totalTasks property value. The totalTasks property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalTasks() {
        return this._totalTasks;
    }
    /**
     * Gets the totalUsers property value. The totalUsers property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUsers() {
        return this._totalUsers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedTasks", this.getFailedTasks());
        writer.writeIntegerValue("failedUsers", this.getFailedUsers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("successfulUsers", this.getSuccessfulUsers());
        writer.writeIntegerValue("totalTasks", this.getTotalTasks());
        writer.writeIntegerValue("totalUsers", this.getTotalUsers());
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
     * Sets the failedTasks property value. The failedTasks property
     * @param value Value to set for the failedTasks property.
     * @return a void
     */
    public void setFailedTasks(@javax.annotation.Nullable final Integer value) {
        this._failedTasks = value;
    }
    /**
     * Sets the failedUsers property value. The failedUsers property
     * @param value Value to set for the failedUsers property.
     * @return a void
     */
    public void setFailedUsers(@javax.annotation.Nullable final Integer value) {
        this._failedUsers = value;
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
     * Sets the successfulUsers property value. The successfulUsers property
     * @param value Value to set for the successfulUsers property.
     * @return a void
     */
    public void setSuccessfulUsers(@javax.annotation.Nullable final Integer value) {
        this._successfulUsers = value;
    }
    /**
     * Sets the totalTasks property value. The totalTasks property
     * @param value Value to set for the totalTasks property.
     * @return a void
     */
    public void setTotalTasks(@javax.annotation.Nullable final Integer value) {
        this._totalTasks = value;
    }
    /**
     * Sets the totalUsers property value. The totalUsers property
     * @param value Value to set for the totalUsers property.
     * @return a void
     */
    public void setTotalUsers(@javax.annotation.Nullable final Integer value) {
        this._totalUsers = value;
    }
}
