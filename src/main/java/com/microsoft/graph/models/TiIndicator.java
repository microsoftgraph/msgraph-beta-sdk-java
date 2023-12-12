package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TiIndicator extends Entity implements Parsable {
    /**
     * Instantiates a new TiIndicator and sets the default values.
     */
    public TiIndicator() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TiIndicator
     */
    @jakarta.annotation.Nonnull
    public static TiIndicator createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TiIndicator();
    }
    /**
     * Gets the action property value. The action to apply if the indicator is matched from within the targetProduct security tool. Possible values are: unknown, allow, block, alert. Required.
     * @return a TiAction
     */
    @jakarta.annotation.Nullable
    public TiAction getAction() {
        return this.backingStore.get("action");
    }
    /**
     * Gets the activityGroupNames property value. The cyber threat intelligence name(s) for the parties responsible for the malicious activity covered by the threat indicator.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getActivityGroupNames() {
        return this.backingStore.get("activityGroupNames");
    }
    /**
     * Gets the additionalInformation property value. A catchall area for extra data from the indicator that is not specifically covered by other tiIndicator properties. The security tool specified by targetProduct typically does not utilize this data.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInformation() {
        return this.backingStore.get("additionalInformation");
    }
    /**
     * Gets the azureTenantId property value. Stamped by the system when the indicator is ingested. The Microsoft Entra tenant id of submitting client. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureTenantId() {
        return this.backingStore.get("azureTenantId");
    }
    /**
     * Gets the confidence property value. An integer representing the confidence the data within the indicator accurately identifies malicious behavior. Acceptable values are 0  100 with 100 being the highest.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConfidence() {
        return this.backingStore.get("confidence");
    }
    /**
     * Gets the description property value. Brief description (100 characters or less) of the threat represented by the indicator. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the diamondModel property value. The area of the Diamond Model in which this indicator exists. Possible values are: unknown, adversary, capability, infrastructure, victim.
     * @return a DiamondModel
     */
    @jakarta.annotation.Nullable
    public DiamondModel getDiamondModel() {
        return this.backingStore.get("diamondModel");
    }
    /**
     * Gets the domainName property value. The domainName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.backingStore.get("domainName");
    }
    /**
     * Gets the emailEncoding property value. The emailEncoding property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailEncoding() {
        return this.backingStore.get("emailEncoding");
    }
    /**
     * Gets the emailLanguage property value. The emailLanguage property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailLanguage() {
        return this.backingStore.get("emailLanguage");
    }
    /**
     * Gets the emailRecipient property value. The emailRecipient property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailRecipient() {
        return this.backingStore.get("emailRecipient");
    }
    /**
     * Gets the emailSenderAddress property value. The emailSenderAddress property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailSenderAddress() {
        return this.backingStore.get("emailSenderAddress");
    }
    /**
     * Gets the emailSenderName property value. The emailSenderName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailSenderName() {
        return this.backingStore.get("emailSenderName");
    }
    /**
     * Gets the emailSourceDomain property value. The emailSourceDomain property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailSourceDomain() {
        return this.backingStore.get("emailSourceDomain");
    }
    /**
     * Gets the emailSourceIpAddress property value. The emailSourceIpAddress property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailSourceIpAddress() {
        return this.backingStore.get("emailSourceIpAddress");
    }
    /**
     * Gets the emailSubject property value. The emailSubject property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailSubject() {
        return this.backingStore.get("emailSubject");
    }
    /**
     * Gets the emailXMailer property value. The emailXMailer property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailXMailer() {
        return this.backingStore.get("emailXMailer");
    }
    /**
     * Gets the expirationDateTime property value. DateTime string indicating when the Indicator expires. All indicators must have an expiration date to avoid stale indicators persisting in the system. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Required.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * Gets the externalId property value. An identification number that ties the indicator back to the indicator providers system (for example, a foreign key).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(TiAction::forValue)); });
        deserializerMap.put("activityGroupNames", (n) -> { this.setActivityGroupNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("additionalInformation", (n) -> { this.setAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("azureTenantId", (n) -> { this.setAzureTenantId(n.getStringValue()); });
        deserializerMap.put("confidence", (n) -> { this.setConfidence(n.getIntegerValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("diamondModel", (n) -> { this.setDiamondModel(n.getEnumValue(DiamondModel::forValue)); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("emailEncoding", (n) -> { this.setEmailEncoding(n.getStringValue()); });
        deserializerMap.put("emailLanguage", (n) -> { this.setEmailLanguage(n.getStringValue()); });
        deserializerMap.put("emailRecipient", (n) -> { this.setEmailRecipient(n.getStringValue()); });
        deserializerMap.put("emailSenderAddress", (n) -> { this.setEmailSenderAddress(n.getStringValue()); });
        deserializerMap.put("emailSenderName", (n) -> { this.setEmailSenderName(n.getStringValue()); });
        deserializerMap.put("emailSourceDomain", (n) -> { this.setEmailSourceDomain(n.getStringValue()); });
        deserializerMap.put("emailSourceIpAddress", (n) -> { this.setEmailSourceIpAddress(n.getStringValue()); });
        deserializerMap.put("emailSubject", (n) -> { this.setEmailSubject(n.getStringValue()); });
        deserializerMap.put("emailXMailer", (n) -> { this.setEmailXMailer(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("fileCompileDateTime", (n) -> { this.setFileCompileDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fileCreatedDateTime", (n) -> { this.setFileCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fileHashType", (n) -> { this.setFileHashType(n.getEnumValue(FileHashType::forValue)); });
        deserializerMap.put("fileHashValue", (n) -> { this.setFileHashValue(n.getStringValue()); });
        deserializerMap.put("fileMutexName", (n) -> { this.setFileMutexName(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("filePacker", (n) -> { this.setFilePacker(n.getStringValue()); });
        deserializerMap.put("filePath", (n) -> { this.setFilePath(n.getStringValue()); });
        deserializerMap.put("fileSize", (n) -> { this.setFileSize(n.getLongValue()); });
        deserializerMap.put("fileType", (n) -> { this.setFileType(n.getStringValue()); });
        deserializerMap.put("ingestedDateTime", (n) -> { this.setIngestedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("killChain", (n) -> { this.setKillChain(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("knownFalsePositives", (n) -> { this.setKnownFalsePositives(n.getStringValue()); });
        deserializerMap.put("lastReportedDateTime", (n) -> { this.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("malwareFamilyNames", (n) -> { this.setMalwareFamilyNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("networkCidrBlock", (n) -> { this.setNetworkCidrBlock(n.getStringValue()); });
        deserializerMap.put("networkDestinationAsn", (n) -> { this.setNetworkDestinationAsn(n.getLongValue()); });
        deserializerMap.put("networkDestinationCidrBlock", (n) -> { this.setNetworkDestinationCidrBlock(n.getStringValue()); });
        deserializerMap.put("networkDestinationIPv4", (n) -> { this.setNetworkDestinationIPv4(n.getStringValue()); });
        deserializerMap.put("networkDestinationIPv6", (n) -> { this.setNetworkDestinationIPv6(n.getStringValue()); });
        deserializerMap.put("networkDestinationPort", (n) -> { this.setNetworkDestinationPort(n.getIntegerValue()); });
        deserializerMap.put("networkIPv4", (n) -> { this.setNetworkIPv4(n.getStringValue()); });
        deserializerMap.put("networkIPv6", (n) -> { this.setNetworkIPv6(n.getStringValue()); });
        deserializerMap.put("networkPort", (n) -> { this.setNetworkPort(n.getIntegerValue()); });
        deserializerMap.put("networkProtocol", (n) -> { this.setNetworkProtocol(n.getIntegerValue()); });
        deserializerMap.put("networkSourceAsn", (n) -> { this.setNetworkSourceAsn(n.getLongValue()); });
        deserializerMap.put("networkSourceCidrBlock", (n) -> { this.setNetworkSourceCidrBlock(n.getStringValue()); });
        deserializerMap.put("networkSourceIPv4", (n) -> { this.setNetworkSourceIPv4(n.getStringValue()); });
        deserializerMap.put("networkSourceIPv6", (n) -> { this.setNetworkSourceIPv6(n.getStringValue()); });
        deserializerMap.put("networkSourcePort", (n) -> { this.setNetworkSourcePort(n.getIntegerValue()); });
        deserializerMap.put("passiveOnly", (n) -> { this.setPassiveOnly(n.getBooleanValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getIntegerValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("targetProduct", (n) -> { this.setTargetProduct(n.getStringValue()); });
        deserializerMap.put("threatType", (n) -> { this.setThreatType(n.getStringValue()); });
        deserializerMap.put("tlpLevel", (n) -> { this.setTlpLevel(n.getEnumValue(TlpLevel::forValue)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        deserializerMap.put("userAgent", (n) -> { this.setUserAgent(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileCompileDateTime property value. The fileCompileDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFileCompileDateTime() {
        return this.backingStore.get("fileCompileDateTime");
    }
    /**
     * Gets the fileCreatedDateTime property value. The fileCreatedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFileCreatedDateTime() {
        return this.backingStore.get("fileCreatedDateTime");
    }
    /**
     * Gets the fileHashType property value. The fileHashType property
     * @return a FileHashType
     */
    @jakarta.annotation.Nullable
    public FileHashType getFileHashType() {
        return this.backingStore.get("fileHashType");
    }
    /**
     * Gets the fileHashValue property value. The fileHashValue property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileHashValue() {
        return this.backingStore.get("fileHashValue");
    }
    /**
     * Gets the fileMutexName property value. The fileMutexName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileMutexName() {
        return this.backingStore.get("fileMutexName");
    }
    /**
     * Gets the fileName property value. The fileName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.backingStore.get("fileName");
    }
    /**
     * Gets the filePacker property value. The filePacker property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilePacker() {
        return this.backingStore.get("filePacker");
    }
    /**
     * Gets the filePath property value. The filePath property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilePath() {
        return this.backingStore.get("filePath");
    }
    /**
     * Gets the fileSize property value. The fileSize property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getFileSize() {
        return this.backingStore.get("fileSize");
    }
    /**
     * Gets the fileType property value. The fileType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileType() {
        return this.backingStore.get("fileType");
    }
    /**
     * Gets the ingestedDateTime property value. Stamped by the system when the indicator is ingested. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getIngestedDateTime() {
        return this.backingStore.get("ingestedDateTime");
    }
    /**
     * Gets the isActive property value. Used to deactivate indicators within system. By default, any indicator submitted is set as active. However, providers may submit existing indicators with this set to False to deactivate indicators in the system.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.backingStore.get("isActive");
    }
    /**
     * Gets the killChain property value. A JSON array of strings that describes which point or points on the Kill Chain this indicator targets. See killChain values below for exact values.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getKillChain() {
        return this.backingStore.get("killChain");
    }
    /**
     * Gets the knownFalsePositives property value. Scenarios in which the indicator may cause false positives. This should be human-readable text.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKnownFalsePositives() {
        return this.backingStore.get("knownFalsePositives");
    }
    /**
     * Gets the lastReportedDateTime property value. The last time the indicator was seen. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.backingStore.get("lastReportedDateTime");
    }
    /**
     * Gets the malwareFamilyNames property value. The malware family name associated with an indicator if it exists. Microsoft prefers the Microsoft malware family name if at all possible that can be found via the Windows Defender Security Intelligence threat encyclopedia.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMalwareFamilyNames() {
        return this.backingStore.get("malwareFamilyNames");
    }
    /**
     * Gets the networkCidrBlock property value. The networkCidrBlock property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkCidrBlock() {
        return this.backingStore.get("networkCidrBlock");
    }
    /**
     * Gets the networkDestinationAsn property value. The networkDestinationAsn property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNetworkDestinationAsn() {
        return this.backingStore.get("networkDestinationAsn");
    }
    /**
     * Gets the networkDestinationCidrBlock property value. The networkDestinationCidrBlock property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkDestinationCidrBlock() {
        return this.backingStore.get("networkDestinationCidrBlock");
    }
    /**
     * Gets the networkDestinationIPv4 property value. The networkDestinationIPv4 property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkDestinationIPv4() {
        return this.backingStore.get("networkDestinationIPv4");
    }
    /**
     * Gets the networkDestinationIPv6 property value. The networkDestinationIPv6 property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkDestinationIPv6() {
        return this.backingStore.get("networkDestinationIPv6");
    }
    /**
     * Gets the networkDestinationPort property value. The networkDestinationPort property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNetworkDestinationPort() {
        return this.backingStore.get("networkDestinationPort");
    }
    /**
     * Gets the networkIPv4 property value. The networkIPv4 property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkIPv4() {
        return this.backingStore.get("networkIPv4");
    }
    /**
     * Gets the networkIPv6 property value. The networkIPv6 property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkIPv6() {
        return this.backingStore.get("networkIPv6");
    }
    /**
     * Gets the networkPort property value. The networkPort property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNetworkPort() {
        return this.backingStore.get("networkPort");
    }
    /**
     * Gets the networkProtocol property value. The networkProtocol property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNetworkProtocol() {
        return this.backingStore.get("networkProtocol");
    }
    /**
     * Gets the networkSourceAsn property value. The networkSourceAsn property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNetworkSourceAsn() {
        return this.backingStore.get("networkSourceAsn");
    }
    /**
     * Gets the networkSourceCidrBlock property value. The networkSourceCidrBlock property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkSourceCidrBlock() {
        return this.backingStore.get("networkSourceCidrBlock");
    }
    /**
     * Gets the networkSourceIPv4 property value. The networkSourceIPv4 property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkSourceIPv4() {
        return this.backingStore.get("networkSourceIPv4");
    }
    /**
     * Gets the networkSourceIPv6 property value. The networkSourceIPv6 property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkSourceIPv6() {
        return this.backingStore.get("networkSourceIPv6");
    }
    /**
     * Gets the networkSourcePort property value. The networkSourcePort property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNetworkSourcePort() {
        return this.backingStore.get("networkSourcePort");
    }
    /**
     * Gets the passiveOnly property value. Determines if the indicator should trigger an event that is visible to an end-user. When set to true, security tools won't notify the end user that a hit has occurred. This is most often treated as audit or silent mode by security products where they'll simply log that a match occurred but won't perform the action. Default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPassiveOnly() {
        return this.backingStore.get("passiveOnly");
    }
    /**
     * Gets the severity property value. An integer representing the severity of the malicious behavior identified by the data within the indicator. Acceptable values are 0  5 where 5 is the most severe and zero isn't severe at all. Default value is 3.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Gets the tags property value. A JSON array of strings that stores arbitrary tags/keywords.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Gets the targetProduct property value. A string value representing a single security product to which the indicator should be applied. Acceptable values are: Azure Sentinel, Microsoft Defender ATP. Required
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetProduct() {
        return this.backingStore.get("targetProduct");
    }
    /**
     * Gets the threatType property value. Each indicator must have a valid Indicator Threat Type. Possible values are: Botnet, C2, CryptoMining, Darknet, DDoS, MaliciousUrl, Malware, Phishing, Proxy, PUA, WatchList. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThreatType() {
        return this.backingStore.get("threatType");
    }
    /**
     * Gets the tlpLevel property value. Traffic Light Protocol value for the indicator. Possible values are: unknown, white, green, amber, red. Required.
     * @return a TlpLevel
     */
    @jakarta.annotation.Nullable
    public TlpLevel getTlpLevel() {
        return this.backingStore.get("tlpLevel");
    }
    /**
     * Gets the url property value. The url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.backingStore.get("url");
    }
    /**
     * Gets the userAgent property value. The userAgent property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserAgent() {
        return this.backingStore.get("userAgent");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeCollectionOfPrimitiveValues("activityGroupNames", this.getActivityGroupNames());
        writer.writeStringValue("additionalInformation", this.getAdditionalInformation());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeIntegerValue("confidence", this.getConfidence());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("diamondModel", this.getDiamondModel());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeStringValue("emailEncoding", this.getEmailEncoding());
        writer.writeStringValue("emailLanguage", this.getEmailLanguage());
        writer.writeStringValue("emailRecipient", this.getEmailRecipient());
        writer.writeStringValue("emailSenderAddress", this.getEmailSenderAddress());
        writer.writeStringValue("emailSenderName", this.getEmailSenderName());
        writer.writeStringValue("emailSourceDomain", this.getEmailSourceDomain());
        writer.writeStringValue("emailSourceIpAddress", this.getEmailSourceIpAddress());
        writer.writeStringValue("emailSubject", this.getEmailSubject());
        writer.writeStringValue("emailXMailer", this.getEmailXMailer());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeOffsetDateTimeValue("fileCompileDateTime", this.getFileCompileDateTime());
        writer.writeOffsetDateTimeValue("fileCreatedDateTime", this.getFileCreatedDateTime());
        writer.writeEnumValue("fileHashType", this.getFileHashType());
        writer.writeStringValue("fileHashValue", this.getFileHashValue());
        writer.writeStringValue("fileMutexName", this.getFileMutexName());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("filePacker", this.getFilePacker());
        writer.writeStringValue("filePath", this.getFilePath());
        writer.writeLongValue("fileSize", this.getFileSize());
        writer.writeStringValue("fileType", this.getFileType());
        writer.writeOffsetDateTimeValue("ingestedDateTime", this.getIngestedDateTime());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeCollectionOfPrimitiveValues("killChain", this.getKillChain());
        writer.writeStringValue("knownFalsePositives", this.getKnownFalsePositives());
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeCollectionOfPrimitiveValues("malwareFamilyNames", this.getMalwareFamilyNames());
        writer.writeStringValue("networkCidrBlock", this.getNetworkCidrBlock());
        writer.writeLongValue("networkDestinationAsn", this.getNetworkDestinationAsn());
        writer.writeStringValue("networkDestinationCidrBlock", this.getNetworkDestinationCidrBlock());
        writer.writeStringValue("networkDestinationIPv4", this.getNetworkDestinationIPv4());
        writer.writeStringValue("networkDestinationIPv6", this.getNetworkDestinationIPv6());
        writer.writeIntegerValue("networkDestinationPort", this.getNetworkDestinationPort());
        writer.writeStringValue("networkIPv4", this.getNetworkIPv4());
        writer.writeStringValue("networkIPv6", this.getNetworkIPv6());
        writer.writeIntegerValue("networkPort", this.getNetworkPort());
        writer.writeIntegerValue("networkProtocol", this.getNetworkProtocol());
        writer.writeLongValue("networkSourceAsn", this.getNetworkSourceAsn());
        writer.writeStringValue("networkSourceCidrBlock", this.getNetworkSourceCidrBlock());
        writer.writeStringValue("networkSourceIPv4", this.getNetworkSourceIPv4());
        writer.writeStringValue("networkSourceIPv6", this.getNetworkSourceIPv6());
        writer.writeIntegerValue("networkSourcePort", this.getNetworkSourcePort());
        writer.writeBooleanValue("passiveOnly", this.getPassiveOnly());
        writer.writeIntegerValue("severity", this.getSeverity());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeStringValue("targetProduct", this.getTargetProduct());
        writer.writeStringValue("threatType", this.getThreatType());
        writer.writeEnumValue("tlpLevel", this.getTlpLevel());
        writer.writeStringValue("url", this.getUrl());
        writer.writeStringValue("userAgent", this.getUserAgent());
    }
    /**
     * Sets the action property value. The action to apply if the indicator is matched from within the targetProduct security tool. Possible values are: unknown, allow, block, alert. Required.
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final TiAction value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the activityGroupNames property value. The cyber threat intelligence name(s) for the parties responsible for the malicious activity covered by the threat indicator.
     * @param value Value to set for the activityGroupNames property.
     */
    public void setActivityGroupNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("activityGroupNames", value);
    }
    /**
     * Sets the additionalInformation property value. A catchall area for extra data from the indicator that is not specifically covered by other tiIndicator properties. The security tool specified by targetProduct typically does not utilize this data.
     * @param value Value to set for the additionalInformation property.
     */
    public void setAdditionalInformation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("additionalInformation", value);
    }
    /**
     * Sets the azureTenantId property value. Stamped by the system when the indicator is ingested. The Microsoft Entra tenant id of submitting client. Required.
     * @param value Value to set for the azureTenantId property.
     */
    public void setAzureTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureTenantId", value);
    }
    /**
     * Sets the confidence property value. An integer representing the confidence the data within the indicator accurately identifies malicious behavior. Acceptable values are 0  100 with 100 being the highest.
     * @param value Value to set for the confidence property.
     */
    public void setConfidence(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("confidence", value);
    }
    /**
     * Sets the description property value. Brief description (100 characters or less) of the threat represented by the indicator. Required.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the diamondModel property value. The area of the Diamond Model in which this indicator exists. Possible values are: unknown, adversary, capability, infrastructure, victim.
     * @param value Value to set for the diamondModel property.
     */
    public void setDiamondModel(@jakarta.annotation.Nullable final DiamondModel value) {
        this.backingStore.set("diamondModel", value);
    }
    /**
     * Sets the domainName property value. The domainName property
     * @param value Value to set for the domainName property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainName", value);
    }
    /**
     * Sets the emailEncoding property value. The emailEncoding property
     * @param value Value to set for the emailEncoding property.
     */
    public void setEmailEncoding(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailEncoding", value);
    }
    /**
     * Sets the emailLanguage property value. The emailLanguage property
     * @param value Value to set for the emailLanguage property.
     */
    public void setEmailLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailLanguage", value);
    }
    /**
     * Sets the emailRecipient property value. The emailRecipient property
     * @param value Value to set for the emailRecipient property.
     */
    public void setEmailRecipient(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailRecipient", value);
    }
    /**
     * Sets the emailSenderAddress property value. The emailSenderAddress property
     * @param value Value to set for the emailSenderAddress property.
     */
    public void setEmailSenderAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailSenderAddress", value);
    }
    /**
     * Sets the emailSenderName property value. The emailSenderName property
     * @param value Value to set for the emailSenderName property.
     */
    public void setEmailSenderName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailSenderName", value);
    }
    /**
     * Sets the emailSourceDomain property value. The emailSourceDomain property
     * @param value Value to set for the emailSourceDomain property.
     */
    public void setEmailSourceDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailSourceDomain", value);
    }
    /**
     * Sets the emailSourceIpAddress property value. The emailSourceIpAddress property
     * @param value Value to set for the emailSourceIpAddress property.
     */
    public void setEmailSourceIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailSourceIpAddress", value);
    }
    /**
     * Sets the emailSubject property value. The emailSubject property
     * @param value Value to set for the emailSubject property.
     */
    public void setEmailSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailSubject", value);
    }
    /**
     * Sets the emailXMailer property value. The emailXMailer property
     * @param value Value to set for the emailXMailer property.
     */
    public void setEmailXMailer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailXMailer", value);
    }
    /**
     * Sets the expirationDateTime property value. DateTime string indicating when the Indicator expires. All indicators must have an expiration date to avoid stale indicators persisting in the system. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Required.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the externalId property value. An identification number that ties the indicator back to the indicator providers system (for example, a foreign key).
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the fileCompileDateTime property value. The fileCompileDateTime property
     * @param value Value to set for the fileCompileDateTime property.
     */
    public void setFileCompileDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("fileCompileDateTime", value);
    }
    /**
     * Sets the fileCreatedDateTime property value. The fileCreatedDateTime property
     * @param value Value to set for the fileCreatedDateTime property.
     */
    public void setFileCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("fileCreatedDateTime", value);
    }
    /**
     * Sets the fileHashType property value. The fileHashType property
     * @param value Value to set for the fileHashType property.
     */
    public void setFileHashType(@jakarta.annotation.Nullable final FileHashType value) {
        this.backingStore.set("fileHashType", value);
    }
    /**
     * Sets the fileHashValue property value. The fileHashValue property
     * @param value Value to set for the fileHashValue property.
     */
    public void setFileHashValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileHashValue", value);
    }
    /**
     * Sets the fileMutexName property value. The fileMutexName property
     * @param value Value to set for the fileMutexName property.
     */
    public void setFileMutexName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileMutexName", value);
    }
    /**
     * Sets the fileName property value. The fileName property
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileName", value);
    }
    /**
     * Sets the filePacker property value. The filePacker property
     * @param value Value to set for the filePacker property.
     */
    public void setFilePacker(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filePacker", value);
    }
    /**
     * Sets the filePath property value. The filePath property
     * @param value Value to set for the filePath property.
     */
    public void setFilePath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filePath", value);
    }
    /**
     * Sets the fileSize property value. The fileSize property
     * @param value Value to set for the fileSize property.
     */
    public void setFileSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("fileSize", value);
    }
    /**
     * Sets the fileType property value. The fileType property
     * @param value Value to set for the fileType property.
     */
    public void setFileType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileType", value);
    }
    /**
     * Sets the ingestedDateTime property value. Stamped by the system when the indicator is ingested. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the ingestedDateTime property.
     */
    public void setIngestedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("ingestedDateTime", value);
    }
    /**
     * Sets the isActive property value. Used to deactivate indicators within system. By default, any indicator submitted is set as active. However, providers may submit existing indicators with this set to False to deactivate indicators in the system.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isActive", value);
    }
    /**
     * Sets the killChain property value. A JSON array of strings that describes which point or points on the Kill Chain this indicator targets. See killChain values below for exact values.
     * @param value Value to set for the killChain property.
     */
    public void setKillChain(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("killChain", value);
    }
    /**
     * Sets the knownFalsePositives property value. Scenarios in which the indicator may cause false positives. This should be human-readable text.
     * @param value Value to set for the knownFalsePositives property.
     */
    public void setKnownFalsePositives(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("knownFalsePositives", value);
    }
    /**
     * Sets the lastReportedDateTime property value. The last time the indicator was seen. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastReportedDateTime property.
     */
    public void setLastReportedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastReportedDateTime", value);
    }
    /**
     * Sets the malwareFamilyNames property value. The malware family name associated with an indicator if it exists. Microsoft prefers the Microsoft malware family name if at all possible that can be found via the Windows Defender Security Intelligence threat encyclopedia.
     * @param value Value to set for the malwareFamilyNames property.
     */
    public void setMalwareFamilyNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("malwareFamilyNames", value);
    }
    /**
     * Sets the networkCidrBlock property value. The networkCidrBlock property
     * @param value Value to set for the networkCidrBlock property.
     */
    public void setNetworkCidrBlock(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkCidrBlock", value);
    }
    /**
     * Sets the networkDestinationAsn property value. The networkDestinationAsn property
     * @param value Value to set for the networkDestinationAsn property.
     */
    public void setNetworkDestinationAsn(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("networkDestinationAsn", value);
    }
    /**
     * Sets the networkDestinationCidrBlock property value. The networkDestinationCidrBlock property
     * @param value Value to set for the networkDestinationCidrBlock property.
     */
    public void setNetworkDestinationCidrBlock(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkDestinationCidrBlock", value);
    }
    /**
     * Sets the networkDestinationIPv4 property value. The networkDestinationIPv4 property
     * @param value Value to set for the networkDestinationIPv4 property.
     */
    public void setNetworkDestinationIPv4(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkDestinationIPv4", value);
    }
    /**
     * Sets the networkDestinationIPv6 property value. The networkDestinationIPv6 property
     * @param value Value to set for the networkDestinationIPv6 property.
     */
    public void setNetworkDestinationIPv6(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkDestinationIPv6", value);
    }
    /**
     * Sets the networkDestinationPort property value. The networkDestinationPort property
     * @param value Value to set for the networkDestinationPort property.
     */
    public void setNetworkDestinationPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("networkDestinationPort", value);
    }
    /**
     * Sets the networkIPv4 property value. The networkIPv4 property
     * @param value Value to set for the networkIPv4 property.
     */
    public void setNetworkIPv4(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkIPv4", value);
    }
    /**
     * Sets the networkIPv6 property value. The networkIPv6 property
     * @param value Value to set for the networkIPv6 property.
     */
    public void setNetworkIPv6(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkIPv6", value);
    }
    /**
     * Sets the networkPort property value. The networkPort property
     * @param value Value to set for the networkPort property.
     */
    public void setNetworkPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("networkPort", value);
    }
    /**
     * Sets the networkProtocol property value. The networkProtocol property
     * @param value Value to set for the networkProtocol property.
     */
    public void setNetworkProtocol(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("networkProtocol", value);
    }
    /**
     * Sets the networkSourceAsn property value. The networkSourceAsn property
     * @param value Value to set for the networkSourceAsn property.
     */
    public void setNetworkSourceAsn(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("networkSourceAsn", value);
    }
    /**
     * Sets the networkSourceCidrBlock property value. The networkSourceCidrBlock property
     * @param value Value to set for the networkSourceCidrBlock property.
     */
    public void setNetworkSourceCidrBlock(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkSourceCidrBlock", value);
    }
    /**
     * Sets the networkSourceIPv4 property value. The networkSourceIPv4 property
     * @param value Value to set for the networkSourceIPv4 property.
     */
    public void setNetworkSourceIPv4(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkSourceIPv4", value);
    }
    /**
     * Sets the networkSourceIPv6 property value. The networkSourceIPv6 property
     * @param value Value to set for the networkSourceIPv6 property.
     */
    public void setNetworkSourceIPv6(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkSourceIPv6", value);
    }
    /**
     * Sets the networkSourcePort property value. The networkSourcePort property
     * @param value Value to set for the networkSourcePort property.
     */
    public void setNetworkSourcePort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("networkSourcePort", value);
    }
    /**
     * Sets the passiveOnly property value. Determines if the indicator should trigger an event that is visible to an end-user. When set to true, security tools won't notify the end user that a hit has occurred. This is most often treated as audit or silent mode by security products where they'll simply log that a match occurred but won't perform the action. Default value is false.
     * @param value Value to set for the passiveOnly property.
     */
    public void setPassiveOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passiveOnly", value);
    }
    /**
     * Sets the severity property value. An integer representing the severity of the malicious behavior identified by the data within the indicator. Acceptable values are 0  5 where 5 is the most severe and zero isn't severe at all. Default value is 3.
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("severity", value);
    }
    /**
     * Sets the tags property value. A JSON array of strings that stores arbitrary tags/keywords.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
    /**
     * Sets the targetProduct property value. A string value representing a single security product to which the indicator should be applied. Acceptable values are: Azure Sentinel, Microsoft Defender ATP. Required
     * @param value Value to set for the targetProduct property.
     */
    public void setTargetProduct(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetProduct", value);
    }
    /**
     * Sets the threatType property value. Each indicator must have a valid Indicator Threat Type. Possible values are: Botnet, C2, CryptoMining, Darknet, DDoS, MaliciousUrl, Malware, Phishing, Proxy, PUA, WatchList. Required.
     * @param value Value to set for the threatType property.
     */
    public void setThreatType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("threatType", value);
    }
    /**
     * Sets the tlpLevel property value. Traffic Light Protocol value for the indicator. Possible values are: unknown, white, green, amber, red. Required.
     * @param value Value to set for the tlpLevel property.
     */
    public void setTlpLevel(@jakarta.annotation.Nullable final TlpLevel value) {
        this.backingStore.set("tlpLevel", value);
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("url", value);
    }
    /**
     * Sets the userAgent property value. The userAgent property
     * @param value Value to set for the userAgent property.
     */
    public void setUserAgent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userAgent", value);
    }
}
