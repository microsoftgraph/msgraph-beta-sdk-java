package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftApplicationDataAccessSettings extends Entity implements Parsable {
    /** The ID of an Azure Active Directory (Azure AD) security group for which the members are allowed to access Microsoft 365 data using only Microsoft 365 apps, but not other Microsoft apps such as Edge.  This is only applicable if isEnabledForAllMicrosoftApplications is set to true. */
    private String disabledForGroup;
    /** When set to true, all users in the organization can access in a Microsoft app any Microsoft 365 data that the user has been authorized to access. The Microsoft app can be a Microsoft 365 app (for example, Excel, Outlook) or non-Microsoft 365 app (for example, Edge). The default is true.  It is possible to disable this access for a subset of users in an Azure AD security group, by specifying the group in the disabledForGroup property.  When set to false, all users can access authorized Microsoft 365 data only in a Microsoft 365 app. */
    private Boolean isEnabledForAllMicrosoftApplications;
    /**
     * Instantiates a new microsoftApplicationDataAccessSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftApplicationDataAccessSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftApplicationDataAccessSettings
     */
    @javax.annotation.Nonnull
    public static MicrosoftApplicationDataAccessSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftApplicationDataAccessSettings();
    }
    /**
     * Gets the disabledForGroup property value. The ID of an Azure Active Directory (Azure AD) security group for which the members are allowed to access Microsoft 365 data using only Microsoft 365 apps, but not other Microsoft apps such as Edge.  This is only applicable if isEnabledForAllMicrosoftApplications is set to true.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisabledForGroup() {
        return this.disabledForGroup;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("disabledForGroup", (n) -> { this.setDisabledForGroup(n.getStringValue()); });
        deserializerMap.put("isEnabledForAllMicrosoftApplications", (n) -> { this.setIsEnabledForAllMicrosoftApplications(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabledForAllMicrosoftApplications property value. When set to true, all users in the organization can access in a Microsoft app any Microsoft 365 data that the user has been authorized to access. The Microsoft app can be a Microsoft 365 app (for example, Excel, Outlook) or non-Microsoft 365 app (for example, Edge). The default is true.  It is possible to disable this access for a subset of users in an Azure AD security group, by specifying the group in the disabledForGroup property.  When set to false, all users can access authorized Microsoft 365 data only in a Microsoft 365 app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabledForAllMicrosoftApplications() {
        return this.isEnabledForAllMicrosoftApplications;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("disabledForGroup", this.getDisabledForGroup());
        writer.writeBooleanValue("isEnabledForAllMicrosoftApplications", this.getIsEnabledForAllMicrosoftApplications());
    }
    /**
     * Sets the disabledForGroup property value. The ID of an Azure Active Directory (Azure AD) security group for which the members are allowed to access Microsoft 365 data using only Microsoft 365 apps, but not other Microsoft apps such as Edge.  This is only applicable if isEnabledForAllMicrosoftApplications is set to true.
     * @param value Value to set for the disabledForGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisabledForGroup(@javax.annotation.Nullable final String value) {
        this.disabledForGroup = value;
    }
    /**
     * Sets the isEnabledForAllMicrosoftApplications property value. When set to true, all users in the organization can access in a Microsoft app any Microsoft 365 data that the user has been authorized to access. The Microsoft app can be a Microsoft 365 app (for example, Excel, Outlook) or non-Microsoft 365 app (for example, Edge). The default is true.  It is possible to disable this access for a subset of users in an Azure AD security group, by specifying the group in the disabledForGroup property.  When set to false, all users can access authorized Microsoft 365 data only in a Microsoft 365 app.
     * @param value Value to set for the isEnabledForAllMicrosoftApplications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabledForAllMicrosoftApplications(@javax.annotation.Nullable final Boolean value) {
        this.isEnabledForAllMicrosoftApplications = value;
    }
}
